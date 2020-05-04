package com.avrisnox.dndgens.QuestCardGenerator;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

@SuppressWarnings("unused")
public class Objective {
	private boolean optional;
	private List<Objective> children;
	private Objective next;
	private ObjectiveTypeObject type;
	private List<Object> params;
	private String task;

	public Objective() {
		optional = true;
		children = null;
		next = null;
		type = ObjectiveTypes.SURVIVE.FOR;
		params = new LinkedList<>();
		params.add(Double.POSITIVE_INFINITY);
		task = "Survive forever.";
	}

	public Objective(ObjectiveTypeObject objectiveType, String task, Object... objectiveParams) {
		optional = true;
		children = null;
		next = null;
		type = objectiveType;
		params = new LinkedList<>();
		params.addAll(Arrays.asList(objectiveParams));
		this.task = task;
	}

	public boolean isOptional() {
		return optional;
	}

	public void setOptional(boolean optional) {
		this.optional = optional;
	}

	public void addChild(Objective child) {
		if(children == null)
			children = new LinkedList<>();
		children.add(child);
	}

	public boolean remChild(Objective child) {
		if(children == null)
			return false;
		boolean result = children.remove(child);
		if(children.size() == 0) clearChildren();
		return result;
	}

	public void clearChildren() {
		children = null;
	}

	public List<Objective> getChildren() {
		return children;
	}

	public Objective getNext() {
		return next;
	}

	public void setNext(Objective next) {
		this.next = next;
	}

	public ObjectiveTypeObject getType() {
		return type;
	}

	public void setType(ObjectiveTypeObject type) {
		this.type = type;
	}

	public void addParam(Object param) {
		params.add(param);
	}

	public boolean remParam(Object param) {
		return params.remove(param);
	}

	public void clearParams() {
		params = new LinkedList<>();
	}

	public List<Object> getParams() {
		return params;
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}
}
