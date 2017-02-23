/*
 * The MIT License
 *
 * Copyright 2017 GedMarc.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package za.co.mmagon.jwebswing.plugins.glyphicons;

import java.util.logging.Logger;
import za.co.mmagon.jwebswing.Component;
import za.co.mmagon.jwebswing.Page;
import za.co.mmagon.jwebswing.PageConfigurator;
import za.co.mmagon.jwebswing.base.references.CSSReference;
import za.co.mmagon.jwebswing.plugins.PluginInformation;
import za.co.mmagon.logger.LogFactory;

/**
 *
 * @author GedMarc
 * @since 15 Feb 2017
 *
 */
@PluginInformation(pluginName = "Glyphicons", pluginUniqueName = "glyphicons", pluginDescription = "GLYPHICONS is a library of precisely prepared monochromatic icons and symbols, created with an emphasis to simplicity and easy orientation.",
        pluginVersion = "1.9.2",
        pluginDependancyUniqueIDs = "", pluginCategories = "fonts, icons",
        pluginSubtitle = "Icons are not designed only for toolbars and navigation in Apple's OS X, iOS, and watchOS. They work perfectly almost everywhere. ",
        pluginGitUrl = "https://github.com/GedMarc/JWebSwing-GlyphiconsPlugin",
        pluginSourceUrl = "",
        pluginWikiUrl = "https://github.com/GedMarc/JWebSwing-GlyphiconsPlugin/wiki",
        pluginOriginalHomepage = "http://glyphicons.com/")
public class GlyphiconsPageConfigurator extends PageConfigurator
{

    private static final long serialVersionUID = 1L;
    private static final Logger log = LogFactory.getInstance().getLogger("Glyphicons");
    public static final String GlyphiconsEnabled = "glyphicons-enabled";

    public GlyphiconsPageConfigurator()
    {

    }

    @Override
    public Page configure(Page page)
    {
        if (!page.isConfigured())
        {
            if (page.getBody().readChildrenPropertyFirstResult(GlyphiconsEnabled, true))
            {
                page.getBody().addCssReference(new CSSReference("Glyphicons", 1.92, "bower_components/glyphicons-only-bootstrap/css/bootstrap.min.css"));
            }
        }
        return page;
    }

    /**
     * Sets the component as font awesome required to build
     *
     * @param component
     * @param required
     */
    public static void setGlyphiconsRequired(Component component, boolean required)
    {
        component.getProperties().put(GlyphiconsEnabled, required);
    }
}
