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
// IDL:iris.edu/Fissures/IfRealTimeCollector/DasConfig:1.0
//
public abstract class DasConfigPOA
    extends org.omg.PortableServer.Servant
    implements org.omg.CORBA.portable.InvokeHandler,
               DasConfigOperations
{
    static final String[] _ob_ids_ =
    {
        "IDL:iris.edu/Fissures/IfRealTimeCollector/DasConfig:1.0",
    };

    public DasConfig
    _this()
    {
        return DasConfigHelper.narrow(super._this_object());
    }

    public DasConfig
    _this(org.omg.CORBA.ORB orb)
    {
        return DasConfigHelper.narrow(super._this_object(orb));
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
            "add_collector_by_ref",
            "add_collector_by_string",
            "set_collector_by_ref",
            "set_collector_by_string",
            "set_soh_by_ref",
            "set_soh_by_string"
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
        case 0: // add_collector_by_ref
            return _OB_op_add_collector_by_ref(in, handler);

        case 1: // add_collector_by_string
            return _OB_op_add_collector_by_string(in, handler);

        case 2: // set_collector_by_ref
            return _OB_op_set_collector_by_ref(in, handler);

        case 3: // set_collector_by_string
            return _OB_op_set_collector_by_string(in, handler);

        case 4: // set_soh_by_ref
            return _OB_op_set_soh_by_ref(in, handler);

        case 5: // set_soh_by_string
            return _OB_op_set_soh_by_string(in, handler);
        }

        throw new org.omg.CORBA.BAD_OPERATION();
    }

    private org.omg.CORBA.portable.OutputStream
    _OB_op_add_collector_by_ref(org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler handler)
    {
        org.omg.CORBA.portable.OutputStream out = null;
        try
        {
            RealTimeCollector[] _ob_a0 = RealTimeCollectorSeqHelper.read(in);
            add_collector_by_ref(_ob_a0);
            out = handler.createReply();
        }
        catch(CollectorMaxExceeded _ob_ex)
        {
            out = handler.createExceptionReply();
            CollectorMaxExceededHelper.write(out, _ob_ex);
        }
        return out;
    }

    private org.omg.CORBA.portable.OutputStream
    _OB_op_add_collector_by_string(org.omg.CORBA.portable.InputStream in,
                                   org.omg.CORBA.portable.ResponseHandler handler)
    {
        org.omg.CORBA.portable.OutputStream out = null;
        try
        {
            String[] _ob_a0 = CollectorStringRefSeqHelper.read(in);
            add_collector_by_string(_ob_a0);
            out = handler.createReply();
        }
        catch(CollectorMaxExceeded _ob_ex)
        {
            out = handler.createExceptionReply();
            CollectorMaxExceededHelper.write(out, _ob_ex);
        }
        return out;
    }

    private org.omg.CORBA.portable.OutputStream
    _OB_op_set_collector_by_ref(org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler handler)
    {
        org.omg.CORBA.portable.OutputStream out = null;
        try
        {
            RealTimeCollector[] _ob_a0 = RealTimeCollectorSeqHelper.read(in);
            set_collector_by_ref(_ob_a0);
            out = handler.createReply();
        }
        catch(CollectorMaxExceeded _ob_ex)
        {
            out = handler.createExceptionReply();
            CollectorMaxExceededHelper.write(out, _ob_ex);
        }
        return out;
    }

    private org.omg.CORBA.portable.OutputStream
    _OB_op_set_collector_by_string(org.omg.CORBA.portable.InputStream in,
                                   org.omg.CORBA.portable.ResponseHandler handler)
    {
        org.omg.CORBA.portable.OutputStream out = null;
        try
        {
            String[] _ob_a0 = CollectorStringRefSeqHelper.read(in);
            set_collector_by_string(_ob_a0);
            out = handler.createReply();
        }
        catch(CollectorMaxExceeded _ob_ex)
        {
            out = handler.createExceptionReply();
            CollectorMaxExceededHelper.write(out, _ob_ex);
        }
        return out;
    }

    private org.omg.CORBA.portable.OutputStream
    _OB_op_set_soh_by_ref(org.omg.CORBA.portable.InputStream in,
                          org.omg.CORBA.portable.ResponseHandler handler)
    {
        org.omg.CORBA.portable.OutputStream out = null;
        try
        {
            DasSoh _ob_a0 = DasSohHelper.read(in);
            set_soh_by_ref(_ob_a0);
            out = handler.createReply();
        }
        catch(edu.iris.Fissures.NotImplemented _ob_ex)
        {
            out = handler.createExceptionReply();
            edu.iris.Fissures.NotImplementedHelper.write(out, _ob_ex);
        }
        return out;
    }

    private org.omg.CORBA.portable.OutputStream
    _OB_op_set_soh_by_string(org.omg.CORBA.portable.InputStream in,
                             org.omg.CORBA.portable.ResponseHandler handler)
    {
        org.omg.CORBA.portable.OutputStream out = null;
        try
        {
            String[] _ob_a0 = SohStringRefSeqHelper.read(in);
            set_soh_by_string(_ob_a0);
            out = handler.createReply();
        }
        catch(edu.iris.Fissures.NotImplemented _ob_ex)
        {
            out = handler.createExceptionReply();
            edu.iris.Fissures.NotImplementedHelper.write(out, _ob_ex);
        }
        return out;
    }
}
