/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.zamia.verilog.node;

import org.zamia.verilog.analysis.*;

@SuppressWarnings("nls")
public final class AP6ModuleOrGenerateItemDeclaration extends PModuleOrGenerateItemDeclaration
{
    private PEventDeclaration _eventDeclaration_;

    public AP6ModuleOrGenerateItemDeclaration()
    {
        // Constructor
    }

    public AP6ModuleOrGenerateItemDeclaration(
        @SuppressWarnings("hiding") PEventDeclaration _eventDeclaration_)
    {
        // Constructor
        setEventDeclaration(_eventDeclaration_);

    }

    @Override
    public Object clone()
    {
        return new AP6ModuleOrGenerateItemDeclaration(
            cloneNode(this._eventDeclaration_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAP6ModuleOrGenerateItemDeclaration(this);
    }

    public PEventDeclaration getEventDeclaration()
    {
        return this._eventDeclaration_;
    }

    public void setEventDeclaration(PEventDeclaration node)
    {
        if(this._eventDeclaration_ != null)
        {
            this._eventDeclaration_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._eventDeclaration_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._eventDeclaration_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._eventDeclaration_ == child)
        {
            this._eventDeclaration_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._eventDeclaration_ == oldChild)
        {
            setEventDeclaration((PEventDeclaration) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}