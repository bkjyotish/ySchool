package org.yarlithub.yschool.repository.model.obj.yschool;

import com.felees.hbnpojogen.persistence.IPojoGenEntity;
import java.io.Serializable;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import org.hibernate.proxy.HibernateProxy;
import org.yarlithub.yschool.repository.model.obj.yschool.ExamSync;
import org.yarlithub.yschool.repository.model.obj.yschool.Marks;
import org.yarlithub.yschool.repository.model.obj.yschool.Results;
import org.yarlithub.yschool.repository.model.obj.yschool.iface.IExam;


/** 
 * Object mapping for hibernate-handled table: exam.
 * @author autogenerated
 */

@Entity
@Table(name = "exam", schema = "yschool")
public class Exam implements Cloneable, Serializable, IPojoGenEntity, IExam {

	/** Serial Version UID. */
	private static final long serialVersionUID = -558977429L;

	/** Use a WeakHashMap so entries will be garbage collected once all entities 
		referring to a saved hash are garbage collected themselves. */
	private static final Map<Serializable, Integer> SAVED_HASHES =
		Collections.synchronizedMap(new WeakHashMap<Serializable, Integer>());
	
	/** hashCode temporary storage. */
	private volatile Integer hashCode;
	

	/** Field mapping. */
	private ClassroomModule classroomModuleIdclassroomModule;
	/** Field mapping. */
	private Date date;
	/** Field mapping. */
	private Set<ExamSync> examSyncs = new HashSet<ExamSync>();

	/** Field mapping. */
	private ExamType examTypeIdexamType;
	/** Field mapping. */
	private Integer id = 0; // init for hibernate bug workaround
	/** Field mapping. */
	private Set<Marks> markss = new HashSet<Marks>();

	/** Field mapping. */
	private Date modifiedTime;
	/** Field mapping. */
	private Set<Results> resultss = new HashSet<Results>();

	/** Field mapping. */
	private Integer term;
	/**
	 * Default constructor, mainly for hibernate use.
	 */
	public Exam() {
		// Default constructor
	} 

	/** Constructor taking a given ID.
	 * @param id to set
	 */
	public Exam(Integer id) {
		this.id = id;
	}
	
	/** Constructor taking a given ID.
	 * @param date Date object;
	 * @param id Integer object;
	 * @param modifiedTime Date object;
	 * @param term Integer object;
	 */
	public Exam(Date date, Integer id, Date modifiedTime, 					
			Integer term) {

		this.date = date;
		this.id = id;
		this.modifiedTime = modifiedTime;
		this.term = term;
	}
	
 


 
	/** Return the type of this class. Useful for when dealing with proxies.
	* @return Defining class.
	*/
	@Transient
	public Class<?> getClassType() {
		return Exam.class;
	}
 

    /**
     * Return the value associated with the column: classroomModuleIdclassroomModule.
	 * @return A ClassroomModule object (this.classroomModuleIdclassroomModule)
	 */
	@ManyToOne( cascade = { CascadeType.PERSIST, CascadeType.MERGE }, fetch = FetchType.LAZY )
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE})
	@Basic( optional = true )
	@JoinColumn(name = "classroom_module_idclassroom_module", nullable = true )
	public ClassroomModule getClassroomModuleIdclassroomModule() {
		return this.classroomModuleIdclassroomModule;
		
	}
	

  
    /**  
     * Set the value related to the column: classroomModuleIdclassroomModule.
	 * @param classroomModuleIdclassroomModule the classroomModuleIdclassroomModule value you wish to set
	 */
	public void setClassroomModuleIdclassroomModule(final ClassroomModule classroomModuleIdclassroomModule) {
		this.classroomModuleIdclassroomModule = classroomModuleIdclassroomModule;
	}

    /**
     * Return the value associated with the column: date.
	 * @return A Date object (this.date)
	 */
	@Basic( optional = false )
	@Column( nullable = false  )
	public Date getDate() {
		return this.date;
		
	}
	

  
    /**  
     * Set the value related to the column: date.
	 * @param date the date value you wish to set
	 */
	public void setDate(final Date date) {
		this.date = date;
	}

    /**
     * Return the value associated with the column: examSync.
	 * @return A Set&lt;ExamSync&gt; object (this.examSync)
	 */
 	@OneToMany( fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE }, mappedBy = "examIdexam"  )
 	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE})
	@Basic( optional = false )
	@Column( nullable = false  )
	public Set<ExamSync> getExamSyncs() {
		return this.examSyncs;
		
	}
	
	/**
	 * Adds a bi-directional link of type ExamSync to the examSyncs set.
	 * @param examSync item to add
	 */
	public void addExamSync(ExamSync examSync) {
		examSync.setExamIdexam(this);
		this.examSyncs.add(examSync);
	}

  
    /**  
     * Set the value related to the column: examSync.
	 * @param examSync the examSync value you wish to set
	 */
	public void setExamSyncs(final Set<ExamSync> examSync) {
		this.examSyncs = examSync;
	}

    /**
     * Return the value associated with the column: examTypeIdexamType.
	 * @return A ExamType object (this.examTypeIdexamType)
	 */
	@ManyToOne( cascade = { CascadeType.PERSIST, CascadeType.MERGE }, fetch = FetchType.LAZY )
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE})
	@Basic( optional = true )
	@JoinColumn(name = "exam_type_idexam_type", nullable = true )
	public ExamType getExamTypeIdexamType() {
		return this.examTypeIdexamType;
		
	}
	

  
    /**  
     * Set the value related to the column: examTypeIdexamType.
	 * @param examTypeIdexamType the examTypeIdexamType value you wish to set
	 */
	public void setExamTypeIdexamType(final ExamType examTypeIdexamType) {
		this.examTypeIdexamType = examTypeIdexamType;
	}

    /**
     * Return the value associated with the column: id.
	 * @return A Integer object (this.id)
	 */
    @Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Basic( optional = false )
	@Column( name = "idexam", nullable = false  )
	public Integer getId() {
		return this.id;
		
	}
	

  
    /**  
     * Set the value related to the column: id.
	 * @param id the id value you wish to set
	 */
	public void setId(final Integer id) {
		// If we've just been persisted and hashCode has been
		// returned then make sure other entities with this
		// ID return the already returned hash code
		if ( (this.id == null || this.id == 0) &&
				(id != null) &&
				(this.hashCode != null) ) {
		SAVED_HASHES.put( id, this.hashCode );
		}
		this.id = id;
	}

    /**
     * Return the value associated with the column: marks.
	 * @return A Set&lt;Marks&gt; object (this.marks)
	 */
 	@OneToMany( fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE }, mappedBy = "examIdexam"  )
 	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE})
	@Basic( optional = false )
	@Column( nullable = false  )
	public Set<Marks> getMarkss() {
		return this.markss;
		
	}
	
	/**
	 * Adds a bi-directional link of type Marks to the markss set.
	 * @param marks item to add
	 */
	public void addMarks(Marks marks) {
		marks.setExamIdexam(this);
		this.markss.add(marks);
	}

  
    /**  
     * Set the value related to the column: marks.
	 * @param marks the marks value you wish to set
	 */
	public void setMarkss(final Set<Marks> marks) {
		this.markss = marks;
	}

    /**
     * Return the value associated with the column: modifiedTime.
	 * @return A Date object (this.modifiedTime)
	 */
	@Basic( optional = false )
	@Column( name = "modified_time", nullable = false  )
	public Date getModifiedTime() {
		return this.modifiedTime;
		
	}
	

  
    /**  
     * Set the value related to the column: modifiedTime.
	 * @param modifiedTime the modifiedTime value you wish to set
	 */
	public void setModifiedTime(final Date modifiedTime) {
		this.modifiedTime = modifiedTime;
	}

    /**
     * Return the value associated with the column: results.
	 * @return A Set&lt;Results&gt; object (this.results)
	 */
 	@OneToMany( fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE }, mappedBy = "examIdexam"  )
 	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE})
	@Basic( optional = false )
	@Column( nullable = false  )
	public Set<Results> getResultss() {
		return this.resultss;
		
	}
	
	/**
	 * Adds a bi-directional link of type Results to the resultss set.
	 * @param results item to add
	 */
	public void addResults(Results results) {
		results.setExamIdexam(this);
		this.resultss.add(results);
	}

  
    /**  
     * Set the value related to the column: results.
	 * @param results the results value you wish to set
	 */
	public void setResultss(final Set<Results> results) {
		this.resultss = results;
	}

    /**
     * Return the value associated with the column: term.
	 * @return A Integer object (this.term)
	 */
	@Basic( optional = false )
	@Column( nullable = false  )
	public Integer getTerm() {
		return this.term;
		
	}
	

  
    /**  
     * Set the value related to the column: term.
	 * @param term the term value you wish to set
	 */
	public void setTerm(final Integer term) {
		this.term = term;
	}


   /**
    * Deep copy.
	* @return cloned object
	* @throws CloneNotSupportedException on error
    */
    @Override
    public Exam clone() throws CloneNotSupportedException {
		
        final Exam copy = (Exam)super.clone();

		copy.setClassroomModuleIdclassroomModule(this.getClassroomModuleIdclassroomModule());
		copy.setDate(this.getDate());
		if (this.getExamSyncs() != null) {
			copy.getExamSyncs().addAll(this.getExamSyncs());
		}
		copy.setExamTypeIdexamType(this.getExamTypeIdexamType());
		copy.setId(this.getId());
		if (this.getMarkss() != null) {
			copy.getMarkss().addAll(this.getMarkss());
		}
		copy.setModifiedTime(this.getModifiedTime());
		if (this.getResultss() != null) {
			copy.getResultss().addAll(this.getResultss());
		}
		copy.setTerm(this.getTerm());
		return copy;
	}
	


	/** Provides toString implementation.
	 * @see java.lang.Object#toString()
	 * @return String representation of this class.
	 */
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		
		sb.append("date: " + this.getDate() + ", ");
		sb.append("id: " + this.getId() + ", ");
		sb.append("modifiedTime: " + this.getModifiedTime() + ", ");
		sb.append("term: " + this.getTerm());
		return sb.toString();		
	}


	/** Equals implementation. 
	 * @see java.lang.Object#equals(java.lang.Object)
	 * @param aThat Object to compare with
	 * @return true/false
	 */
	@Override
	public boolean equals(final Object aThat) {
		Object proxyThat = aThat;
		
		if ( this == aThat ) {
			 return true;
		}

		
		if (aThat instanceof HibernateProxy) {
 			// narrow down the proxy to the class we are dealing with.
 			try {
				proxyThat = ((HibernateProxy) aThat).getHibernateLazyInitializer().getImplementation(); 
			} catch (org.hibernate.ObjectNotFoundException e) {
				return false;
		   	}
		}
		if (aThat == null)  {
			 return false;
		}
		
		final Exam that; 
		try {
			that = (Exam) proxyThat;
			if ( !(that.getClassType().equals(this.getClassType()))){
				return false;
			}
		} catch (org.hibernate.ObjectNotFoundException e) {
				return false;
		} catch (ClassCastException e) {
				return false;
		}
		
		
		boolean result = true;
		result = result && (((this.getId() == null) && ( that.getId() == null)) || (this.getId() != null  && this.getId().equals(that.getId())));
		result = result && (((getClassroomModuleIdclassroomModule() == null) && (that.getClassroomModuleIdclassroomModule() == null)) || (getClassroomModuleIdclassroomModule() != null && getClassroomModuleIdclassroomModule().getId().equals(that.getClassroomModuleIdclassroomModule().getId())));	
		result = result && (((getDate() == null) && (that.getDate() == null)) || (getDate() != null && getDate().equals(that.getDate())));
		result = result && (((getExamTypeIdexamType() == null) && (that.getExamTypeIdexamType() == null)) || (getExamTypeIdexamType() != null && getExamTypeIdexamType().getId().equals(that.getExamTypeIdexamType().getId())));	
		result = result && (((getModifiedTime() == null) && (that.getModifiedTime() == null)) || (getModifiedTime() != null && getModifiedTime().equals(that.getModifiedTime())));
		result = result && (((getTerm() == null) && (that.getTerm() == null)) || (getTerm() != null && getTerm().equals(that.getTerm())));
		return result;
	}
	
	/** Calculate the hashcode.
	 * @see java.lang.Object#hashCode()
	 * @return a calculated number
	 */
	@Override
	public int hashCode() {
		if ( this.hashCode == null ) {
			synchronized ( this ) {
				if ( this.hashCode == null ) {
					Integer newHashCode = null;

					if ( getId() != null ) {
					newHashCode = SAVED_HASHES.get( getId() );
					}
					
					if ( newHashCode == null ) {
						if ( getId() != null && getId() != 0) {
							newHashCode = getId();
						} else {

						}
					}
					
					this.hashCode = newHashCode;
				}
			}
		}
	return this.hashCode;
	}
	

	
}
