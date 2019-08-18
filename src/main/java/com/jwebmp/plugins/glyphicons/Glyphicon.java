/*
 * Copyright (C) 2017 GedMarc
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.jwebmp.plugins.glyphicons;

import com.jwebmp.core.base.ComponentHierarchyBase;
import com.jwebmp.core.base.html.Span;
import com.jwebmp.core.base.html.attributes.NoAttributes;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import com.jwebmp.core.base.interfaces.IIcon;
import com.jwebmp.core.plugins.ComponentInformation;

/**
 * GLYPHICONS is a library of precisely prepared monochromatic icons and symbols, created with an emphasis to simplicity and easy orientation.
 *
 * @author GedMarc
 * @since 23 Feb 2017
 */
@ComponentInformation(name = "Glyphicons",
		description = "GLYPHICONS is a library of precisely prepared monochromatic icons and symbols, created with an emphasis to simplicity and easy orientation.",
		url = "http://glyphicons.com/")
public class Glyphicon
		extends Span<IComponentHierarchyBase, NoAttributes, Glyphicon>
	implements IIcon<Glyphicon>
{
	private Glyphicons icon;

	/**
	 * GLYPHICONS is a library of precisely prepared monochromatic icons and symbols, created with an emphasis to simplicity and easy orientation.
	 *
	 * @param icon
	 */
	public Glyphicon(Glyphicons icon)
	{
		this.icon = icon;
	}

	@Override
	public void preConfigure()
	{
		if (!isConfigured())
		{
			addClass(icon.toString());
		}
		super.preConfigure();
	}

	@Override
	public int hashCode()
	{
		return super.hashCode();
	}

	@Override
	public boolean equals(Object o)
	{
		return super.equals(o);
	}

	/**
	 * Returns this icon
	 *
	 * @return
	 */
	public Glyphicons getIcon()
	{
		return icon;
	}

	/**
	 * Sets this icon
	 *
	 * @param icon
	 */
	public void setIcon(Glyphicons icon)
	{
		this.icon = icon;
	}

	@Override
	public String getClassName()
	{
		return icon.toString();
	}

	@Override
	public ComponentHierarchyBase getIconComponent()
	{
		return this;
	}
}
