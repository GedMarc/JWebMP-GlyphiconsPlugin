/*
 * Copyright (C) 2017 Marc Magon
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

import com.jwebmp.core.Component;
import com.jwebmp.core.Page;
import com.jwebmp.core.PageConfigurator;
import com.jwebmp.core.base.references.CSSReference;
import com.jwebmp.core.plugins.PluginInformation;

/**
 * @author GedMarc
 * @since 15 Feb 2017
 */
@PluginInformation(pluginName = "Glyphicons",
		pluginUniqueName = "glyphicons",
		pluginDescription = "GLYPHICONS is a library of precisely prepared monochromatic icons and symbols, created with an emphasis to simplicity and easy orientation.",
		pluginVersion = "1.9.2",
		pluginDependancyUniqueIDs = "",
		pluginCategories = "fonts, icons",
		pluginSubtitle = "Icons are not designed only for toolbars and navigation in Apple's OS X, iOS, and watchOS. They work perfectly almost everywhere. ",
		pluginGitUrl = "https://github.com/GedMarc/JWebSwing-GlyphiconsPlugin",
		pluginSourceUrl = "",
		pluginWikiUrl = "https://github.com/GedMarc/JWebSwing-GlyphiconsPlugin/wiki",
		pluginOriginalHomepage = "http://glyphicons.com/",
		pluginDownloadUrl = "https://sourceforge.net/projects/jwebswing/files/plugins/GlyphiconsPlugin.jar/download",
		pluginIconUrl = "bower_components/glyphicons-only-bootstrap/square_logo_400x400.png",
		pluginIconImageUrl = "bower_components/glyphicons-only-bootstrap/square_logo_400x400.png",
		pluginLastUpdatedDate = "2017/03/04")
public class GlyphiconsPageConfigurator
		extends PageConfigurator
{

	public static final String GlyphiconsEnabled = "glyphicons-enabled";
	private static final long serialVersionUID = 1L;

	public GlyphiconsPageConfigurator()
	{
		//Nothing Needed
	}

	/**
	 * Sets the component as font awesome required to build
	 *
	 * @param component
	 * @param required
	 */
	@SuppressWarnings("unchecked")
	public static void setGlyphiconsRequired(Component component, boolean required)
	{
		component.getProperties()
		         .put(GlyphiconsEnabled, required);
	}

	@Override
	public Page configure(Page page)
	{
		if (!page.isConfigured())
		{
			page.getBody()
			    .addCssReference(new CSSReference("Glyphicons", 1.92, "bower_components/glyphicons-only-bootstrap/css/bootstrap.min.css", ""));
		}
		return page;
	}
}
