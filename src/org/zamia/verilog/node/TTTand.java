/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.zamia.verilog.node;

import org.zamia.verilog.analysis.*;
import org.zamia.SourceFile;

@SuppressWarnings("nls")
public final class TTTand extends Token
{
    public TTTand(int line, int pos, SourceFile sf)
    {
        super ("&&&", line, pos, sf);
    }

    @Override
    public Object clone()
    {
      return new TTTand(getLine(), getPos(), getSource());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTTTand(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TTTand text.");
    }
}