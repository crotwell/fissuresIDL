// **********************************************************************
//
// Generated by the ORBacus IDL to Java Translator
//
// Copyright (c) 2000
// Object Oriented Concepts, Inc.
// Billerica, MA, USA
//
// All Rights Reserved
//
// **********************************************************************

// Version: 4.0.5

package edu.iris.Fissures.IfEvent;

//
// IDL:iris.edu/Fissures/IfEvent/EventSeqIter:1.0
//
public class EventSeqIterPOATie extends EventSeqIterPOA
{
    private EventSeqIterOperations _ob_delegate_;
    private org.omg.PortableServer.POA _ob_poa_;

    public
    EventSeqIterPOATie(EventSeqIterOperations delegate)
    {
        _ob_delegate_ = delegate;
    }

    public
    EventSeqIterPOATie(EventSeqIterOperations delegate, org.omg.PortableServer.POA poa)
    {
        _ob_delegate_ = delegate;
        _ob_poa_ = poa;
    }

    public EventSeqIterOperations
    _delegate()
    {
        return _ob_delegate_;
    }

    public void
    _delegate(EventSeqIterOperations delegate)
    {
        _ob_delegate_ = delegate;
    }

    public org.omg.PortableServer.POA
    _default_POA()
    {
        if(_ob_poa_ != null)
            return _ob_poa_;
        else
            return super._default_POA();
    }

    //
    // IDL:iris.edu/Fissures/IfEvent/EventSeqIter/how_many_remain:1.0
    //
    public int
    how_many_remain()
    {
        return _ob_delegate_.how_many_remain();
    }

    //
    // IDL:iris.edu/Fissures/IfEvent/EventSeqIter/next_n:1.0
    //
    public boolean
    next_n(int how_many,
           EventAccessSeqHolder seq)
    {
        return _ob_delegate_.next_n(how_many,
                                    seq);
    }

    //
    // IDL:iris.edu/Fissures/IfEvent/EventSeqIter/destroy:1.0
    //
    public void
    destroy()
    {
        _ob_delegate_.destroy();
    }
}
