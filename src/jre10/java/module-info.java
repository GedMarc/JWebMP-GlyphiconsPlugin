import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.plugins.glyphicons.GlyphiconsPageConfigurator;

module com.jwebmp.plugins.glyphicons {
	exports com.jwebmp.plugins.glyphicons;

	requires com.jwebmp.core;
	requires com.jwebmp.logmaster;
	requires com.fasterxml.jackson.annotation;

	requires java.validation;
	requires java.logging;

	provides IPageConfigurator with GlyphiconsPageConfigurator;
	opens com.jwebmp.plugins.glyphicons to com.fasterxml.jackson.databind,com.jwebmp.core;
}
