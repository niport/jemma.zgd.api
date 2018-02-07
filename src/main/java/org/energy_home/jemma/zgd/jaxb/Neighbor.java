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
import java.math.BigInteger;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for Neighbor complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="Neighbor">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ShortAddress" type="{http://www.zigbee.org/GWGSchema}NetworkAddress"/>
 *         &lt;element name="IeeeAddress" type="{http://www.zigbee.org/GWGSchema}IeeeAddress"/>
 *         &lt;element name="DeviceTypeRxOnWhenIdleRelationship" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
 *         &lt;element name="Depth" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
 *         &lt;element name="LQI" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
 *         &lt;element name="ExtendedPANId" type="{http://www.zigbee.org/GWGSchema}IeeeAddress" minOccurs="0"/>
 *         &lt;element name="PermitJoining" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Neighbor", propOrder = { "shortAddress", "ieeeAddress", "deviceTypeRxOnWhenIdleRelationship", "depth", "lqi",
		"extendedPANId", "permitJoining" })
public class Neighbor implements Serializable {

	@XmlElement(name = "ShortAddress")
	protected int shortAddress;
	@XmlElement(name = "IeeeAddress", required = true)
	protected BigInteger ieeeAddress;
	@XmlElement(name = "DeviceTypeRxOnWhenIdleRelationship")
	@XmlSchemaType(name = "unsignedByte")
	protected short deviceTypeRxOnWhenIdleRelationship;
	@XmlElement(name = "Depth")
	@XmlSchemaType(name = "unsignedByte")
	protected short depth;
	@XmlElement(name = "LQI")
	@XmlSchemaType(name = "unsignedByte")
	protected short lqi;
	@XmlElement(name = "ExtendedPANId")
	protected BigInteger extendedPANId;
	@XmlElement(name = "PermitJoining")
	@XmlSchemaType(name = "unsignedByte")
	protected Short permitJoining;

	/**
	 * Gets the value of the shortAddress property.
	 * 
	 */
	public int getShortAddress() {
		return shortAddress;
	}

	/**
	 * Sets the value of the shortAddress property.
	 * 
	 */
	public void setShortAddress(int value) {
		this.shortAddress = value;
	}

	/**
	 * Gets the value of the ieeeAddress property.
	 * 
	 * @return possible object is {@link BigInteger }
	 * 
	 */
	public BigInteger getIeeeAddress() {
		return ieeeAddress;
	}

	/**
	 * Sets the value of the ieeeAddress property.
	 * 
	 * @param value
	 *          allowed object is {@link BigInteger }
	 * 
	 */
	public void setIeeeAddress(BigInteger value) {
		this.ieeeAddress = value;
	}

	/**
	 * Gets the value of the deviceTypeRxOnWhenIdleRelationship property.
	 * 
	 */
	public short getDeviceTypeRxOnWhenIdleRelationship() {
		return deviceTypeRxOnWhenIdleRelationship;
	}

	/**
	 * Sets the value of the deviceTypeRxOnWhenIdleRelationship property.
	 * 
	 */
	public void setDeviceTypeRxOnWhenIdleRelationship(short value) {
		this.deviceTypeRxOnWhenIdleRelationship = value;
	}

	/**
	 * Gets the value of the depth property.
	 * 
	 */
	public short getDepth() {
		return depth;
	}

	/**
	 * Sets the value of the depth property.
	 * 
	 */
	public void setDepth(short value) {
		this.depth = value;
	}

	/**
	 * Gets the value of the lqi property.
	 * 
	 */
	public short getLQI() {
		return lqi;
	}

	/**
	 * Sets the value of the lqi property.
	 * 
	 */
	public void setLQI(short value) {
		this.lqi = value;
	}

	/**
	 * Gets the value of the extendedPANId property.
	 * 
	 * @return possible object is {@link BigInteger }
	 * 
	 */
	public BigInteger getExtendedPANId() {
		return extendedPANId;
	}

	/**
	 * Sets the value of the extendedPANId property.
	 * 
	 * @param value
	 *          allowed object is {@link BigInteger }
	 * 
	 */
	public void setExtendedPANId(BigInteger value) {
		this.extendedPANId = value;
	}

	/**
	 * Gets the value of the permitJoining property.
	 * 
	 * @return possible object is {@link Short }
	 * 
	 */
	public Short getPermitJoining() {
		return permitJoining;
	}

	/**
	 * Sets the value of the permitJoining property.
	 * 
	 * @param value
	 *          allowed object is {@link Short }
	 * 
	 */
	public void setPermitJoining(Short value) {
		this.permitJoining = value;
	}

}
