/*
 * This file is part of aion-emu <aion-emu.com>.
 *
 * aion-emu is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * aion-emu is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with aion-emu.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.aionemu.gameserver.dao;

import com.aionemu.commons.database.dao.DAO;
import com.aionemu.gameserver.model.gameobjects.player.SkillList;
import com.aionemu.gameserver.model.gameobjects.player.Player;


/**
 * Created on: 15.07.2009 19:33:07
 * Edited On:  13.09.2009 19:48:00
 *
 * @author IceReaper, orfeo087, Avol, AEJTester
 */
public abstract class PlayerSkillListDAO implements DAO
{
	/**
     * Returns unique identifier for PlayerSkillListDAO
     *
     * @return unique identifier for PlayerSkillListDAO
     */
	@Override
	public final String getClassName()
	{
		 return PlayerSkillListDAO.class.getName();
	}

	/**
	 * Returns a list of skilllist for player
	 * @param playerId Player object id.
	 * @return a list of skilllist for player
	 */
	public abstract SkillList restoreSkillList(int playerId);

	public abstract void addSkillsTree(Player player);

	public abstract void deleteSkills(int playerId);

	/**
	 * Add a skill information into database
	 * @param playerId player object id
	 */
	public abstract void addSkills(int playerId, int skillId, int skillLevel);

}