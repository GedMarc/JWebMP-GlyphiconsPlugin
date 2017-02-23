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

import za.co.mmagon.jwebswing.base.html.Span;
import za.co.mmagon.jwebswing.base.html.attributes.NoAttributes;
import za.co.mmagon.jwebswing.base.html.interfaces.children.NoChildren;

/**
 * GLYPHICONS is a library of precisely prepared monochromatic icons and symbols, created with an emphasis to simplicity and easy orientation.
 *
 * @author GedMarc
 * @since 23 Feb 2017
 *
 */
public class Glyphicon extends Span<NoChildren, NoAttributes, Span>
{

    private static final long serialVersionUID = 1L;

    private Glyphicons icon;

    /**
     * GLYPHICONS is a library of precisely prepared monochromatic icons and symbols, created with an emphasis to simplicity and easy orientation.
     *
     * @param icon
     */
    public Glyphicon(Glyphicons icon)
    {
        this.icon = icon;
        GlyphiconsPageConfigurator.setGlyphiconsRequired(this, true);
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

    public Glyphicons getIcon()
    {
        return icon;
    }

    public void setIcon(Glyphicons icon)
    {
        this.icon = icon;
    }

}
