/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.zamia.verilog.node;

import org.zamia.verilog.analysis.*;

@SuppressWarnings("nls")
public final class AP3TaskPortItem extends PTaskPortItem
{
    private TKOutput _kOutput_;
    private PTaskPortType _taskPortType_;
    private PIdentifier _identifier_;

    public AP3TaskPortItem()
    {
        // Constructor
    }

    public AP3TaskPortItem(
        @SuppressWarnings("hiding") TKOutput _kOutput_,
        @SuppressWarnings("hiding") PTaskPortType _taskPortType_,
        @SuppressWarnings("hiding") PIdentifier _identifier_)
    {
        // Constructor
        setKOutput(_kOutput_);

        setTaskPortType(_taskPortType_);

        setIdentifier(_identifier_);

    }

    @Override
    public Object clone()
    {
        return new AP3TaskPortItem(
            cloneNode(this._kOutput_),
            cloneNode(this._taskPortType_),
            cloneNode(this._identifier_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAP3TaskPortItem(this);
    }

    public TKOutput getKOutput()
    {
        return this._kOutput_;
    }

    public void setKOutput(TKOutput node)
    {
        if(this._kOutput_ != null)
        {
            this._kOutput_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._kOutput_ = node;
    }

    public PTaskPortType getTaskPortType()
    {
        return this._taskPortType_;
    }

    public void setTaskPortType(PTaskPortType node)
    {
        if(this._taskPortType_ != null)
        {
            this._taskPortType_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._taskPortType_ = node;
    }

    public PIdentifier getIdentifier()
    {
        return this._identifier_;
    }

    public void setIdentifier(PIdentifier node)
    {
        if(this._identifier_ != null)
        {
            this._identifier_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._identifier_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._kOutput_)
            + toString(this._taskPortType_)
            + toString(this._identifier_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._kOutput_ == child)
        {
            this._kOutput_ = null;
            return;
        }

        if(this._taskPortType_ == child)
        {
            this._taskPortType_ = null;
            return;
        }

        if(this._identifier_ == child)
        {
            this._identifier_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._kOutput_ == oldChild)
        {
            setKOutput((TKOutput) newChild);
            return;
        }

        if(this._taskPortType_ == oldChild)
        {
            setTaskPortType((PTaskPortType) newChild);
            return;
        }

        if(this._identifier_ == oldChild)
        {
            setIdentifier((PIdentifier) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}