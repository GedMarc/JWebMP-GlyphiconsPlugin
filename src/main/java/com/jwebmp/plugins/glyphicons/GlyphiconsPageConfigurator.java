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

import com.jwebmp.core.Page;
import com.jwebmp.core.base.references.CSSReference;
import com.jwebmp.core.plugins.PluginInformation;
import com.jwebmp.core.services.IPageConfigurator;

import jakarta.validation.constraints.NotNull;

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
		pluginGitUrl = "https://github.com/GedMarc/JWebMP-GlyphiconsPlugin",
		pluginSourceUrl = "",
		pluginWikiUrl = "https://github.com/GedMarc/JWebMP-GlyphiconsPlugin/wiki",
		pluginOriginalHomepage = "http://glyphicons.com/",
		pluginDownloadUrl = "https://sourceforge.net/projects/jwebswing/files/plugins/GlyphiconsPlugin.jar/download",
		pluginIconUrl = "bower_components/glyphicons-only-bootstrap/square_logo_400x400.png",
		pluginIconImageUrl = "bower_components/glyphicons-only-bootstrap/square_logo_400x400.png",
		pluginLastUpdatedDate = "2017/03/04")
public class GlyphiconsPageConfigurator
		implements IPageConfigurator<GlyphiconsPageConfigurator>
{
	/**
	 * If this configurator is enabled
	 */
	private static boolean enabled = true;

	public GlyphiconsPageConfigurator()
	{
		//Nothing Needed
	}

	/**
	 * Method isEnabled returns the enabled of this AngularAnimatedChangePageConfigurator object.
	 * <p>
	 * If this configurator is enabled
	 *
	 * @return the enabled (type boolean) of this AngularAnimatedChangePageConfigurator object.
	 */
	public static boolean isEnabled()
	{
		return GlyphiconsPageConfigurator.enabled;
	}

	/**
	 * Method setEnabled sets the enabled of this AngularAnimatedChangePageConfigurator object.
	 * <p>
	 * If this configurator is enabled
	 *
	 * @param mustEnable
	 * 		the enabled of this AngularAnimatedChangePageConfigurator object.
	 */
	public static void setEnabled(boolean mustEnable)
	{
		GlyphiconsPageConfigurator.enabled = mustEnable;
	}

	@NotNull
	@Override
	public Page configure(Page page)
	{
		if (!page.isConfigured() && enabled())
		{
			page.getBody()
			    .addCssReference(new CSSReference("Glyphicons", 1.92, "bower_components/glyphicons-only-bootstrap/css/bootstrap.min.css", ""));
		}
		return page;
	}

	@Override
	public boolean enabled()
	{
		return GlyphiconsPageConfigurator.enabled;
	}
}
