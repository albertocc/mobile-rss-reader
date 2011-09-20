/*
 * FeedFormatParser.java
 *
 * Copyright (C) 2005-2006 Tommi Laukkanen
 * http://www.substanceofcode.com
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 *
 */
/*
 * IB 2011-01-14 1.11.5Alpha15 Only compile this if it is the full version.
 * IB 2011-03-13 1.11.5Dev17 Have getFeedTitleList to use title for name when parsing the whole feed.
 */

// Expand to define full vers define
@DFULLVERSDEF@
// Expand to define full vers define
@DINTLINKDEF@
//#ifdef DFULLVERS
package com.substanceofcode.rssreader.businesslogic;

import com.substanceofcode.utils.XmlParser;
import com.substanceofcode.rssreader.businessentities.RssItunesFeed;
import java.io.IOException;
import java.util.Vector;


/**
 * Interface contains methods for parsing general feed.
 *
 * @author Tommi Laukkanen
 */
public interface FeedFormatParser {

    RssItunesFeed parse(XmlParser parser, RssItunesFeed feed,
			int maxItemCount, boolean getFeedTitleList, boolean getTitleOnly)
	throws IOException;
    
}
//#endif
