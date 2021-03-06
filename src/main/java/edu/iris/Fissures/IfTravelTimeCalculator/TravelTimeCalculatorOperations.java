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

package edu.iris.Fissures.IfTravelTimeCalculator;

//
// IDL:iris.edu/Fissures/IfTravelTimeCalculator/TravelTimeCalculator:1.0
//
/***/

public interface TravelTimeCalculatorOperations extends edu.iris.Fissures.IfService.Service
{
    //
    // IDL:iris.edu/Fissures/IfTravelTimeCalculator/TravelTimeCalculator/calculate_travel_times:1.0
    //
    /***/

    edu.iris.Fissures.IfEvent.PredictedArrival[]
    calculate_travel_times(String config,
                           edu.iris.Fissures.Location event_location,
                           edu.iris.Fissures.Location receiver_location,
                           String model_id,
                           String[] phases_to_calculate,
                           PhaseNameSeqHolder unknown_phases);

    //
    // IDL:iris.edu/Fissures/IfTravelTimeCalculator/TravelTimeCalculator/known_phases:1.0
    //
    /***/

    String[]
    known_phases();

    //
    // IDL:iris.edu/Fissures/IfTravelTimeCalculator/TravelTimeCalculator/known_models:1.0
    //
    /***/

    String[]
    known_models();
}
