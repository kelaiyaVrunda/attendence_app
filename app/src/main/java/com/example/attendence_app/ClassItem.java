package com.example.attendence_app;

public class ClassItem {
    public ClassItem(long cid, String classname, String subjectname) {
        this.cid = cid;
        this.classname = classname;
        this.subjectname = subjectname;
    }

    private long cid;
   private String classname;
    private String subjectname;

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public String getSubjectname() {
        return subjectname;
    }

    public void setSubjectname(String subjectname) {
        this.subjectname = subjectname;
    }

    public ClassItem(String classname, String subjectname) {
        this.classname = classname;
        this.subjectname = subjectname;
    }

    public long getCid() {
        return cid;
    }

    public void setCid(long cid) {
        this.cid = cid;
    }
}
