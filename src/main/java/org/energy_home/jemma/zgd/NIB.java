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
package org.energy_home.jemma.zgd;

/**
 * ZigBee Network Layer Information Base properties
 */

public interface NIB {
	public static final short nwkSequenceNumber = 0x81;
	public static final short nwkPassiveAckTimeout = 0x82;
	public static final short nwkMaxBroadcastRetries = 0x83;
	public static final short nwkMaxChildren = 0x84;
	public static final short nwkMaxDepth = 0x85;
	public static final short nwkMaxRouters = 0x86;
	public static final short nwkNeighborTable = 0x87;
	public static final short nwkNetworkBroadcastDeliveryTime = 0x88;
	public static final short nwkReportConstantCost = 0x89;
	public static final short nwkRouteTable = 0x8b;
	public static final short nwkSymLink = 0x8e;
	public static final short nwkCapabilityInformation = 0x8f;
	public static final short nwkAddrAlloc = 0x90;
	public static final short nwkUseTreeRouting = 0x91;
	public static final short nwkManagerAddr = 0x92;
	public static final short nwkMaxSourceRoute = 0x93;
	public static final short nwkUpdateId = 0x94;
	public static final short nwkTransactionPersistenceTime = 0x95;
	public static final short nwkNetworkAddress = 0x96;
	public static final short nwkStackProfile = 0x97;
	public static final short nwkBroadcastTransactionTable = 0x98;
	public static final short nwkGroupIDTable = 0x99;
	public static final short nwkExtendedPANID = 0x9a;
	public static final short nwkUseMulticast = 0x9b;
	public static final short nwkRouteRecordTable = 0x9c;
	public static final short nwkIsConcentrator = 0x9d;
	public static final short nwkConcentratorRadius = 0x9e;
	public static final short nwkConcentratorDiscoveryTime = 0x9f;
	public static final short nwkSecurityLevel = 0xa0;
	public static final short nwkSecurityMaterialSet = 0xa1;
	public static final short nwkActiveKeySeqNumber = 0xa2;
	public static final short nwkAllFresh = 0xa3;
	public static final short nwkSecureAllFrames = 0xa5;
	public static final short nwkLinkStatusPeriod = 0xa6;
	public static final short nwkRouterAgeLimit = 0xa7;
	public static final short nwkUniqueAddr = 0xa8;
	public static final short nwkAddressMap = 0xa9;
	public static final short nwkTimeStamp = 0x8c;
	public static final short nwkPANId = 0x80;
	public static final short nwkTxTotal = 0x8d;
}
