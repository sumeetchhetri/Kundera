/*******************************************************************************
 * * Copyright 2012 Impetus Infotech.
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  * you may not use this file except in compliance with the License.
 *  * You may obtain a copy of the License at
 *  *
 *  *      http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  * See the License for the specific language governing permissions and
 *  * limitations under the License.
 ******************************************************************************/
package com.impetus.client.crud;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

import com.impetus.kundera.index.IndexCollection;

@Entity
@Table(name = "PERSON", schema = "KunderaExamples@luceneCassandraTest")
@IndexCollection(columns = { @com.impetus.kundera.index.Index(name = "personName"),
        @com.impetus.kundera.index.Index(name = "age") })
public class PersonLuceneCassandra
{

    private static final long serialVersionUID = 6068131491098913126L;

    public static final String UID = "uid";

    public static final String EID = "eid";

    public static final String FIRST_NAME = "firstName";

    public static final String LAST_NAME = "lastName";

    public static final String CITY = "city";

    public static final String CREATED = "created";

    public static final String LAST_MODIFIED = "lastModified";

    /** The person id. */
    @Id
    // @Column(name = "PERSON_ID")
    private String personId;

    /** The person name. */
    @Column(name = "PERSON_NAME")
    private String personName;

    /** The age. */
    @Column(name = "AGE")
    private String age;

    @Column(name = "AGEss")
    private byte[] a;

    @Column(name = "ENUM")
    @Enumerated(EnumType.STRING)
    private Day day;

    /**
     * @return the a
     */
    public byte[] getA()
    {
        return a;
    }

    /**
     * @param a
     *            the a to set
     */
    public void setA(byte[] a)
    {
        this.a = a;
    }

    /**
     * Gets the person id.
     * 
     * @return the person id
     */
    public String getPersonId()
    {
        return personId;
    }

    /**
     * Gets the person name.
     * 
     * @return the person name
     */
    public String getPersonName()
    {
        return personName;
    }

    /**
     * Sets the person name.
     * 
     * @param personName
     *            the new person name
     */
    public void setPersonName(String personName)
    {
        this.personName = personName;
    }

    /**
     * Sets the person id.
     * 
     * @param personId
     *            the new person id
     */
    public void setPersonId(String personId)
    {
        this.personId = personId;
    }

    /**
     * @return the age
     */
    public String getAge()
    {
        return age;
    }

    /**
     * @param age
     *            the age to set
     */
    public void setAge(String age)
    {
        this.age = age;
    }

    /**
     * @return the day
     */
    public Day getDay()
    {
        return day;
    }

    /**
     * @param day
     *            the day to set
     */
    public void setDay(Day day)
    {
        this.day = day;
    }

    enum Day
    {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
    }

}
