/*
 * Copyright 2016 EPAM Systems
 * 
 * 
 * This file is part of EPAM Report Portal.
 * https://github.com/reportportal/service-jira
 * 
 * Report Portal is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * Report Portal is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with Report Portal.  If not, see <http://www.gnu.org/licenses/>.
 */ 

package com.serena.reportportal.extension.bugtracking.sbm;

import com.epam.reportportal.extension.bugtracking.ExternalSystemStrategy;
import com.epam.ta.reportportal.database.entity.ExternalSystem;
import com.epam.ta.reportportal.ws.model.externalsystem.PostFormField;
import com.epam.ta.reportportal.ws.model.externalsystem.PostTicketRQ;
import com.epam.ta.reportportal.ws.model.externalsystem.Ticket;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Optional;

import static com.epam.ta.reportportal.commons.Predicates.*;

/**
 * SBM related implementation of {@link ExternalSystemStrategy}.
 *
 * @author Oleksii Zozulenko
 */

public class SbmStrategy implements ExternalSystemStrategy {

	private static final Logger LOGGER = LoggerFactory.getLogger(SbmStrategy.class);

	/**
	 * Test connection to external system with provided details
	 *
	 * @param system - external system details
	 * @return TRUE of connection is OK
	 */
	boolean checkConnection(ExternalSystem system){
return true;
    }

	/**
	 * Get ticket by ID
	 *
	 * @param id     Ticket ID
	 * @param system External System details
	 * @return Optional of Ticket
	 */
	Optional<Ticket> getTicket(String id, ExternalSystem system){
return null;
    }

	/**
	 * Submit ticket into external system
	 *
	 * @param ticketRQ Ticket Request
	 * @param system External System
	 * @return Submitted Ticket
	 */
	Ticket submitTicket(PostTicketRQ ticketRQ, ExternalSystem system){

	    return null;
    }

	/**
	 * Get map of fields for ticket POST into external system
	 *
	 * @param issueType Type of issue
	 * @param system    External System details
	 * @return List of Found fields related to issue type
	 */
	List<PostFormField> getTicketFields(String issueType, ExternalSystem system){
return null;
    }

}