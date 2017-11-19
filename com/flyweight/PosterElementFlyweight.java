package com.flyweight;

import java.awt.Dimension;
import java.awt.Font;

/**
 * ����Ԫ�س�����
 * @author liuqian
 *
 */
public abstract class PosterElementFlyweight {

	abstract public void draw(Font font, Dimension dimension, PosterContext ctx);
}
