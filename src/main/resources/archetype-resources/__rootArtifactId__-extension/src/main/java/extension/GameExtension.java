#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
/**
 * 
 */
package ${package}.extension;

import com.tvd12.ezyfox.core.annotation.ContextConfiguration;
import com.tvd12.ezyfox.sfs2x.extension.RoomExtension;

/**
 * @author tavandung12
 *
 */
@ContextConfiguration(clazz = RoomConfig.class)
public class GameExtension extends RoomExtension {
}
