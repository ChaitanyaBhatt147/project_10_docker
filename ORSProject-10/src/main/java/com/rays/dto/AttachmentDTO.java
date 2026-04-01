package com.rays.dto;

import java.io.IOException;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.Table;

import org.springframework.web.multipart.MultipartFile;

import com.rays.common.BaseDTO;

/**
 * DTO class for Attachment entity.
 * 
 * This class represents file attachments such as profile images.
 * It stores file metadata and binary data in the database.
 * 
 * Features:
 * - Stores file name, type, description
 * - Stores file content as byte array (LOB)
 * - Associates attachment with a user
 * - Supports file upload using MultipartFile
 * 
 * Mapped to table: ST_ATTACHMENT
 * 
 * @author Chaitanya Bhatt
 */
@Entity
@Table(name = "ST_ATTACHMENT")
public class AttachmentDTO extends BaseDTO {

	/**
	 * File name.
	 */
	@Column(name = "NAME", length = 100)
	protected String name = null;

	/**
	 * File type (MIME type).
	 */
	@Column(name = "TYPE", length = 100)
	protected String type = null;

	/**
	 * File description.
	 */
	@Column(name = "DESCRIPTION", length = 500)
	protected String description = null;

	/**
	 * Associated user ID.
	 */
	@Column(name = "USER_ID")
	protected Long userId = null;

	/**
	 * File content stored as binary data.
	 */
	@Lob
	@Column(name = "DOC")
	private byte[] doc;

	/**
	 * Default constructor.
	 */
	public AttachmentDTO() {
	}

	/**
	 * Constructor to create AttachmentDTO from MultipartFile.
	 * 
	 * @param file uploaded file
	 */
	public AttachmentDTO(MultipartFile file) {
		name = file.getOriginalFilename();
		type = file.getContentType();

		try {
			doc = file.getBytes();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @return file name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name file name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return file type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type file type
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description file description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return user ID
	 */
	public Long getUserId() {
		return userId;
	}

	/**
	 * @param userId associated user ID
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}

	/**
	 * Returns dropdown value.
	 * 
	 * @return null (not implemented)
	 */
	public String getValue() {
		return null;
	}

	/**
	 * @return file content
	 */
	public byte[] getDoc() {
		return doc;
	}

	/**
	 * @param doc file content
	 */
	public void setDoc(byte[] doc) {
		this.doc = doc;
	}

	/**
	 * Returns unique key.
	 * 
	 * @return "userId"
	 */
	@Override
	public String getUniqueKey() {
		return "userId";
	}

	/**
	 * Returns unique value.
	 * 
	 * @return userId as string
	 */
	@Override
	public String getUniqueValue() {
		return userId.toString();
	}

	/**
	 * Returns label (not implemented).
	 * 
	 * @return null
	 */
	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Returns table name.
	 * 
	 * @return "ATTACHMENT"
	 */
	@Override
	public String getTableName() {
		// TODO Auto-generated method stub
		return "ATTACHMENT";
	}
}