/**
 * This file is part of JEMMA - http://jemma.energy-home.org
 * (C) Copyright 2013 Telecom Italia (http://www.telecomitalia.it)
 *
 * JEMMA is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License (LGPL) version 3
 * or later as published by the Free Software Foundation, which accompanies
 * this distribution and is available at http://www.gnu.org/licenses/lgpl.html
 *
 * JEMMA is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License (LGPL) for more details.
 *
 */
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.9-03/31/2009 04:14 PM(snajper)-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.03 at 05:23:14 PM CEST 
//

package org.energy_home.jemma.zgd.jaxb;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for SimpleDescriptor complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="SimpleDescriptor">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EndPoint" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedByte">
 *               &lt;minInclusive value="1"/>
 *               &lt;maxInclusive value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ApplicationProfileIdentifier" type="{http://www.zigbee.org/GWGSchema}ProfileIdentifier" minOccurs="0"/>
 *         &lt;element name="ApplicationDeviceIdentifier" type="{http://www.zigbee.org/GWGSchema}DeviceIdentifier" minOccurs="0"/>
 *         &lt;element name="ApplicationDeviceVersion" type="{http://www.zigbee.org/GWGSchema}unsignedNibble" minOccurs="0"/>
 *         &lt;element name="ApplicationInputCluster" type="{http://www.zigbee.org/GWGSchema}ClusterIdentifier" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ApplicationOutputCluster" type="{http://www.zigbee.org/GWGSchema}ClusterIdentifier" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SimpleDescriptor", propOrder = { "endPoint", "applicationProfileIdentifier", "applicationDeviceIdentifier",
		"applicationDeviceVersion", "applicationInputCluster", "applicationOutputCluster" })
public class SimpleDescriptor implements Serializable {

	@XmlElement(name = "EndPoint")
	protected Short endPoint;
	@XmlElement(name = "ApplicationProfileIdentifier")
	protected Integer applicationProfileIdentifier;
	@XmlElement(name = "ApplicationDeviceIdentifier")
	protected Integer applicationDeviceIdentifier;
	@XmlElement(name = "ApplicationDeviceVersion")
	protected Short applicationDeviceVersion;
	@XmlElement(name = "ApplicationInputCluster", type = Integer.class)
	protected List<Integer> applicationInputCluster;
	@XmlElement(name = "ApplicationOutputCluster", type = Integer.class)
	protected List<Integer> applicationOutputCluster;

	/**
	 * Gets the value of the endPoint property.
	 * 
	 * @return possible object is {@link Short }
	 * 
	 */
	public Short getEndPoint() {
		return endPoint;
	}

	/**
	 * Sets the value of the endPoint property.
	 * 
	 * @param value
	 *          allowed object is {@link Short }
	 * 
	 */
	public void setEndPoint(Short value) {
		this.endPoint = value;
	}

	/**
	 * Gets the value of the applicationProfileIdentifier property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getApplicationProfileIdentifier() {
		return applicationProfileIdentifier;
	}

	/**
	 * Sets the value of the applicationProfileIdentifier property.
	 * 
	 * @param value
	 *          allowed object is {@link Integer }
	 * 
	 */
	public void setApplicationProfileIdentifier(Integer value) {
		this.applicationProfileIdentifier = value;
	}

	/**
	 * Gets the value of the applicationDeviceIdentifier property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getApplicationDeviceIdentifier() {
		return applicationDeviceIdentifier;
	}

	/**
	 * Sets the value of the applicationDeviceIdentifier property.
	 * 
	 * @param value
	 *          allowed object is {@link Integer }
	 * 
	 */
	public void setApplicationDeviceIdentifier(Integer value) {
		this.applicationDeviceIdentifier = value;
	}

	/**
	 * Gets the value of the applicationDeviceVersion property.
	 * 
	 * @return possible object is {@link Short }
	 * 
	 */
	public Short getApplicationDeviceVersion() {
		return applicationDeviceVersion;
	}

	/**
	 * Sets the value of the applicationDeviceVersion property.
	 * 
	 * @param value
	 *          allowed object is {@link Short }
	 * 
	 */
	public void setApplicationDeviceVersion(Short value) {
		this.applicationDeviceVersion = value;
	}

	/**
	 * Gets the value of the applicationInputCluster property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot.
	 * Therefore any modification you make to the returned list will be present
	 * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
	 * for the applicationInputCluster property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getApplicationInputCluster().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link Integer }
	 * 
	 * 
	 */
	public List<Integer> getApplicationInputCluster() {
		if (applicationInputCluster == null) {
			applicationInputCluster = new ArrayList<Integer>();
		}
		return this.applicationInputCluster;
	}

	/**
	 * Gets the value of the applicationOutputCluster property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot.
	 * Therefore any modification you make to the returned list will be present
	 * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
	 * for the applicationOutputCluster property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getApplicationOutputCluster().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link Integer }
	 * 
	 * 
	 */
	public List<Integer> getApplicationOutputCluster() {
		if (applicationOutputCluster == null) {
			applicationOutputCluster = new ArrayList<Integer>();
		}
		return this.applicationOutputCluster;
	}

}
