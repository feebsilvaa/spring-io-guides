package com.feedev.gs01restservice.api.hello;

/**
 * Representation class
 * 
 * @author fernando-barbosa
 *
 */
public class Greenting {

	private Long id = null;
	private String content;

	public Greenting(Long id, String content) {
		this.id = id;
		this.content = content;
	}

	public Long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}

}
