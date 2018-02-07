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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for WSNNode complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="WSNNode">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Address" type="{http://www.zigbee.org/GWGSchema}Address"/>
 *         &lt;element name="ParentAddress" type="{http://www.zigbee.org/GWGSchema}Address" minOccurs="0"/>
 *         &lt;element name="StartIndex" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="AssociatedDevices" type="{http://www.zigbee.org/GWGSchema}AssociatedDevices" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CapabilityInformation" type="{http://www.zigbee.org/GWGSchema}MACCapability" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSNNode", propOrder = { "address", "parentAddress", "startIndex", "associatedDevices", "capabilityInformation" })
public class WSNNode implements Serializable {

	@XmlElement(name = "Address", required = true)
	protected Address address;
	@XmlElement(name = "ParentAddress")
	protected Address parentAddress;
	@XmlElement(name = "StartIndex")
	@XmlSchemaType(name = "unsignedInt")
	protected long startIndex;
	@XmlElement(name = "AssociatedDevices")
	protected List<AssociatedDevices> associatedDevices;
	@XmlElement(name = "CapabilityInformation")
	protected MACCapability capabilityInformation;

	/**
	 * Gets the value of the address property.
	 * 
	 * @return possible object is {@link Address }
	 * 
	 */
	public Address getAddress() {
		return address;
	}

	/**
	 * Sets the value of the address property.
	 * 
	 * @param value
	 *          allowed object is {@link Address }
	 * 
	 */
	public void setAddress(Address value) {
		this.address = value;
	}

	/**
	 * Gets the value of the parentAddress property.
	 * 
	 * @return possible object is {@link Address }
	 * 
	 */
	public Address getParentAddress() {
		return parentAddress;
	}

	/**
	 * Sets the value of the parentAddress property.
	 * 
	 * @param value
	 *          allowed object is {@link Address }
	 * 
	 */
	public void setParentAddress(Address value) {
		this.parentAddress = value;
	}

	/**
	 * Gets the value of the startIndex property.
	 * 
	 */
	public long getStartIndex() {
		return startIndex;
	}

	/**
	 * Sets the value of the startIndex property.
	 * 
	 */
	public void setStartIndex(long value) {
		this.startIndex = value;
	}

	/**
	 * Gets the value of the associatedDevices property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot.
	 * Therefore any modification you make to the returned list will be present
	 * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
	 * for the associatedDevices property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getAssociatedDevices().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link AssociatedDevices }
	 * 
	 * 
	 */
	public List<AssociatedDevices> getAssociatedDevices() {
		if (associatedDevices == null) {
			associatedDevices = new ArrayList<AssociatedDevices>();
		}
		return this.associatedDevices;
	}

	/**
	 * Gets the value of the capabilityInformation property.
	 * 
	 * @return possible object is {@link MACCapability }
	 * 
	 */
	public MACCapability getCapabilityInformation() {
		return capabilityInformation;
	}

	/**
	 * Sets the value of the capabilityInformation property.
	 * 
	 * @param value
	 *          allowed object is {@link MACCapability }
	 * 
	 */
	public void setCapabilityInformation(MACCapability value) {
		this.capabilityInformation = value;
	}

}
