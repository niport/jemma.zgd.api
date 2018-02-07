package org.energy_home.jemma.zgd;

public interface GroupsManagerListerner {
	void addGroupConfirm(short status, int groupAddress, short epId);

	void removeGroupConfirm(short status, int groupAddress, short epId);

	void removeAllGroupsConfirm(short status, short epId);
}
