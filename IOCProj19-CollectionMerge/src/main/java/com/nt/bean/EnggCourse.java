package com.nt.bean;

import java.util.Set;

public class EnggCourse {
private Set<String>subject;

public void setSubject(Set<String> subject) {
	this.subject = subject;
}

@Override
public String toString() {
	return "EnggCourse [subject=" + subject + "]";
}
}
