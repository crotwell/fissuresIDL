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

package edu.iris.Fissures.IfDataSetMgr;

//
// IDL:iris.edu/Fissures/IfDataSetMgr/DataSetComponent:1.0
//
public abstract class DataSetComponentPOA
    extends org.omg.PortableServer.Servant
    implements org.omg.CORBA.portable.InvokeHandler,
               DataSetComponentOperations
{
    static final String[] _ob_ids_ =
    {
        "IDL:iris.edu/Fissures/IfDataSetMgr/DataSetComponent:1.0",
    };

    public DataSetComponent
    _this()
    {
        return DataSetComponentHelper.narrow(super._this_object());
    }

    public DataSetComponent
    _this(org.omg.CORBA.ORB orb)
    {
        return DataSetComponentHelper.narrow(super._this_object(orb));
    }

    public String[]
    _all_interfaces(org.omg.PortableServer.POA poa, byte[] objectId)
    {
        return _ob_ids_;
    }

    public org.omg.CORBA.portable.OutputStream
    _invoke(String opName,
            org.omg.CORBA.portable.InputStream in,
            org.omg.CORBA.portable.ResponseHandler handler)
    {
        final String[] _ob_names =
        {
            "_get_a_factory",
            "_get_a_finder"
        };

        int _ob_left = 0;
        int _ob_right = _ob_names.length;
        int _ob_index = -1;

        while(_ob_left < _ob_right)
        {
            int _ob_m = (_ob_left + _ob_right) / 2;
            int _ob_res = _ob_names[_ob_m].compareTo(opName);
            if(_ob_res == 0)
            {
                _ob_index = _ob_m;
                break;
            }
            else if(_ob_res > 0)
                _ob_right = _ob_m;
            else
                _ob_left = _ob_m + 1;
        }

        switch(_ob_index)
        {
        case 0: // _get_a_factory
            return _OB_att_get_a_factory(in, handler);

        case 1: // _get_a_finder
            return _OB_att_get_a_finder(in, handler);
        }

        throw new org.omg.CORBA.BAD_OPERATION();
    }

    private org.omg.CORBA.portable.OutputStream
    _OB_att_get_a_factory(org.omg.CORBA.portable.InputStream in,
                          org.omg.CORBA.portable.ResponseHandler handler)
    {
        DataSetFactory _ob_r = a_factory();
        org.omg.CORBA.portable.OutputStream out = handler.createReply();
        DataSetFactoryHelper.write(out, _ob_r);
        return out;
    }

    private org.omg.CORBA.portable.OutputStream
    _OB_att_get_a_finder(org.omg.CORBA.portable.InputStream in,
                         org.omg.CORBA.portable.ResponseHandler handler)
    {
        DataSetFinder _ob_r = a_finder();
        org.omg.CORBA.portable.OutputStream out = handler.createReply();
        DataSetFinderHelper.write(out, _ob_r);
        return out;
    }
}
