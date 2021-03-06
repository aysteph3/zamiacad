/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.zamia.verilog.node;

import org.zamia.verilog.analysis.*;

@SuppressWarnings("nls")
public final class AP5UnaryModulePathOperator extends PUnaryModulePathOperator
{
    private TTRnor _tRnor_;

    public AP5UnaryModulePathOperator()
    {
        // Constructor
    }

    public AP5UnaryModulePathOperator(
        @SuppressWarnings("hiding") TTRnor _tRnor_)
    {
        // Constructor
        setTRnor(_tRnor_);

    }

    @Override
    public Object clone()
    {
        return new AP5UnaryModulePathOperator(
            cloneNode(this._tRnor_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAP5UnaryModulePathOperator(this);
    }

    public TTRnor getTRnor()
    {
        return this._tRnor_;
    }

    public void setTRnor(TTRnor node)
    {
        if(this._tRnor_ != null)
        {
            this._tRnor_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._tRnor_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._tRnor_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._tRnor_ == child)
        {
            this._tRnor_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._tRnor_ == oldChild)
        {
            setTRnor((TTRnor) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
