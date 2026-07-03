package com.rits.cloning;

import java.lang.annotation.Annotation;

public class CloningStrategyFactory {
	public static ICloningStrategy annotatedField(final Class<? extends Annotation> annotationClass, final ICloningStrategy.Strategy strategy) {
		return (toBeCloned, field) -> {
			if (toBeCloned == null) return ICloningStrategy.Strategy.IGNORE;
			if (field.getDeclaredAnnotation(annotationClass) != null) return strategy;
			return ICloningStrategy.Strategy.IGNORE;
		};
	}
}
