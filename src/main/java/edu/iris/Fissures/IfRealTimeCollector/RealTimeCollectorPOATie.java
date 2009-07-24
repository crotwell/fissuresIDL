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

package edu.iris.Fissures.IfRealTimeCollector;

//
// IDL:iris.edu/Fissures/IfRealTimeCollector/RealTimeCollector:1.0
//
public class RealTimeCollectorPOATie extends RealTimeCollectorPOA
{
    private RealTimeCollectorOperations _ob_delegate_;
    private org.omg.PortableServer.POA _ob_poa_;

    public
    RealTimeCollectorPOATie(RealTimeCollectorOperations delegate)
    {
        _ob_delegate_ = delegate;
    }

    public
    RealTimeCollectorPOATie(RealTimeCollectorOperations delegate, org.omg.PortableServer.POA poa)
    {
        _ob_delegate_ = delegate;
        _ob_poa_ = poa;
    }

    public RealTimeCollectorOperations
    _delegate()
    {
        return _ob_delegate_;
    }

    public void
    _delegate(RealTimeCollectorOperations delegate)
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
    // IDL:iris.edu/Fissures/IfRealTimeCollector/RealTimeCollector/configure:1.0
    //
    public void
    configure(CollectorConfiguration[] a_configuration)
    {
        _ob_delegate_.configure(a_configuration);
    }

    //
    // IDL:iris.edu/Fissures/IfRealTimeCollector/RealTimeCollector/add_data:1.0
    //
    public void
    add_data(DataChunk[] data)
        throws UnknownChannels,
               ChunkOutOfOrder
    {
        _ob_delegate_.add_data(data);
    }

    //
    // IDL:iris.edu/Fissures/IfRealTimeCollector/RealTimeCollector/reset_sequence:1.0
    //
    public void
    reset_sequence(edu.iris.Fissures.IfNetwork.ChannelId[] channels,
                   int[] next_valid)
        throws UnknownChannels
    {
        _ob_delegate_.reset_sequence(channels,
                                     next_valid);
    }

    //
    // IDL:iris.edu/Fissures/IfRealTimeCollector/RealTimeCollector/get_collector:1.0
    //
    public RealTimeCollector
    get_collector()
        throws edu.iris.Fissures.NotImplemented
    {
        return _ob_delegate_.get_collector();
    }

    //
    // IDL:iris.edu/Fissures/IfRealTimeCollector/RealTimeCollector/destroy:1.0
    //
    public void
    destroy()
    {
        _ob_delegate_.destroy();
    }
}