/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.zamia.verilog.node;

import org.zamia.verilog.analysis.*;

@SuppressWarnings("nls")
public final class AP3TaskItemDeclaration extends PTaskItemDeclaration
{
    private PTfInoutDeclaration _tfInoutDeclaration_;
    private TTSemicolon _tSemicolon_;

    public AP3TaskItemDeclaration()
    {
        // Constructor
    }

    public AP3TaskItemDeclaration(
        @SuppressWarnings("hiding") PTfInoutDeclaration _tfInoutDeclaration_,
        @SuppressWarnings("hiding") TTSemicolon _tSemicolon_)
    {
        // Constructor
        setTfInoutDeclaration(_tfInoutDeclaration_);

        setTSemicolon(_tSemicolon_);

    }

    @Override
    public Object clone()
    {
        return new AP3TaskItemDeclaration(
            cloneNode(this._tfInoutDeclaration_),
            cloneNode(this._tSemicolon_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAP3TaskItemDeclaration(this);
    }

    public PTfInoutDeclaration getTfInoutDeclaration()
    {
        return this._tfInoutDeclaration_;
    }

    public void setTfInoutDeclaration(PTfInoutDeclaration node)
    {
        if(this._tfInoutDeclaration_ != null)
        {
            this._tfInoutDeclaration_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._tfInoutDeclaration_ = node;
    }

    public TTSemicolon getTSemicolon()
    {
        return this._tSemicolon_;
    }

    public void setTSemicolon(TTSemicolon node)
    {
        if(this._tSemicolon_ != null)
        {
            this._tSemicolon_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._tSemicolon_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._tfInoutDeclaration_)
            + toString(this._tSemicolon_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._tfInoutDeclaration_ == child)
        {
            this._tfInoutDeclaration_ = null;
            return;
        }

        if(this._tSemicolon_ == child)
        {
            this._tSemicolon_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._tfInoutDeclaration_ == oldChild)
        {
            setTfInoutDeclaration((PTfInoutDeclaration) newChild);
            return;
        }

        if(this._tSemicolon_ == oldChild)
        {
            setTSemicolon((TTSemicolon) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}