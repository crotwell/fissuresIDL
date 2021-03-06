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

package edu.iris.Fissures.IfNetwork;

//
// IDL:iris.edu/Fissures/IfNetwork/NetworkFinder:1.0
//
public class NetworkFinderPOATie extends NetworkFinderPOA
{
    private NetworkFinderOperations _ob_delegate_;
    private org.omg.PortableServer.POA _ob_poa_;

    public
    NetworkFinderPOATie(NetworkFinderOperations delegate)
    {
        _ob_delegate_ = delegate;
    }

    public
    NetworkFinderPOATie(NetworkFinderOperations delegate, org.omg.PortableServer.POA poa)
    {
        _ob_delegate_ = delegate;
        _ob_poa_ = poa;
    }

    public NetworkFinderOperations
    _delegate()
    {
        return _ob_delegate_;
    }

    public void
    _delegate(NetworkFinderOperations delegate)
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
    // IDL:iris.edu/Fissures/IfNetwork/NetworkFinder/retrieve_by_id:1.0
    //
    public NetworkAccess
    retrieve_by_id(NetworkId id)
        throws NetworkNotFound
    {
        return _ob_delegate_.retrieve_by_id(id);
    }

    //
    // IDL:iris.edu/Fissures/IfNetwork/NetworkFinder/retrieve_by_code:1.0
    //
    public NetworkAccess[]
    retrieve_by_code(String code)
        throws NetworkNotFound
    {
        return _ob_delegate_.retrieve_by_code(code);
    }

    //
    // IDL:iris.edu/Fissures/IfNetwork/NetworkFinder/retrieve_by_name:1.0
    //
    public NetworkAccess[]
    retrieve_by_name(String name)
        throws NetworkNotFound
    {
        return _ob_delegate_.retrieve_by_name(name);
    }

    //
    // IDL:iris.edu/Fissures/IfNetwork/NetworkFinder/retrieve_all:1.0
    //
    public NetworkAccess[]
    retrieve_all()
    {
        return _ob_delegate_.retrieve_all();
    }
}
