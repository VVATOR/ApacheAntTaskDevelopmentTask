package com.epam.training;

import java.io.File;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Task;
import org.apache.tools.ant.types.FileSet;

public class FilesRenamer extends Task {
    private static final String DOT = ".";
    private static final String DASH = "-";
    private String targetDir;
    private String postfix;
    private FileSet fileSet;

    @Override
    public void execute() throws BuildException {
        super.execute();
        log("START TASk: filesRenamer");
        log("-------------------------");
        if (null == fileSet) {
            throw new BuildException("Exception: " + getLocation() + ": missing <fileSet>");
        }
        if (null == postfix) {
            throw new BuildException("Exception:" + getLocation() + ": missing required \"postfix\" attribute.");
        }
        renameFiles();
    }

    private void renameFiles() {
        log("Start renaming files");
        String[] sarr = fileSet.getDirectoryScanner(getProject()).getIncludedFiles();
        log("Prepared a list files (" + sarr.length + "pcs)  for rename");
        for (String fileName : sarr) {
            String newFileName = generateNewFileName(fileName);
            File file = new File(targetDir, newFileName);
            if (file.exists()) {
                log(fileName + " \t NOT RENAMED (file with  name \"" + newFileName + "\" - exist)");
            } else {
                File old = new File(targetDir, fileName);
                old.renameTo(file);
                log(fileName + " \t==>\t" + newFileName);
            }
        }
    }

    private String generateNewFileName(final String fileName) {
        final int extDotPos = fileName.lastIndexOf(DOT);
        final String splitName = fileName.substring(0, extDotPos);
        final String splitExt = fileName.substring(extDotPos);
        return splitName + DASH + postfix + splitExt;
    }

    public void addFileSet(final FileSet fileset) {
        this.fileSet = fileset;
    }

    public void setTargetDir(final String targetDir) {
        this.targetDir = targetDir;
    }

    public void setPostfix(final String postfix) {
        this.postfix = postfix;
    }
}
