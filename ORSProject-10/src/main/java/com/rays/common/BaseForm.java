package com.rays.common;

/**
 * Base Form class used for transferring data from UI to backend.
 * 
 * This class acts as a parent for all form objects and provides
 * common properties such as:
 * - ID
 * - Audit fields (createdBy, modifiedBy, timestamps)
 * - Pagination support
 * - Bulk operation support (ids)
 * 
 * It also provides utility methods to convert form data into DTO.
 * 
 * @author Chaitanya Bhatt
 */
public class BaseForm {

	/**
	 * Primary key of the record.
	 */
	protected Long id;

	/**
	 * User who created the record.
	 */
	protected String createdBy;

	/**
	 * User who last modified the record.
	 */
	protected String modifiedBy;

	/**
	 * Created timestamp (in milliseconds).
	 */
	protected long createdDatetime;

	/**
	 * Modified timestamp (in milliseconds).
	 */
	protected long modifiedDatetime;

	/**
	 * Array of IDs for bulk operations.
	 */
	private Long[] ids;

	/**
	 * Current page number for pagination.
	 */
	private int pageNo = 0;

	/**
	 * Page size for pagination.
	 */
	private int pageSize = 5;

	/**
	 * Operation type (e.g., save, delete, search).
	 */
	private String operation;

	/**
	 * Gets ID.
	 * 
	 * @return ID
	 */
	public Long getId() {
		return id;
	}

	/**
	 * Sets ID.
	 * 
	 * @param id primary key
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * Converts form data into DTO.
	 * This method should be overridden in child classes.
	 * 
	 * @return BaseDTO object
	 */
	public BaseDTO getDto() {
		return null;
	}

	/**
	 * Initializes DTO with ID from form.
	 * 
	 * @param dto DTO object
	 * @param <T> DTO type
	 * @return initialized DTO
	 */
	public <T extends BaseDTO> T initDTO(T dto) {
		System.out.println("id => base dto => " + id);
		if (id != null && id > 0) {
			dto.setId(id);
		} else {
			dto.setId(null);
		}
		return dto;
	}
}