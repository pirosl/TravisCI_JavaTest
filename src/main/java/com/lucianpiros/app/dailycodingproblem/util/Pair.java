package com.lucianpiros.app.dailycodingproblem.util;

/**
 * Generic Pair class
 */ 

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class Pair<T,S> {
	private	T first;
	private S second;

	public Pair(T first, S second) {
		this.first = first;
		this.second = second;
	}
}
