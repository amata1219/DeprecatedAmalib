package amata1219.amalib.location;

import org.bukkit.World;

public class ImmutableEntityLocation extends ImmutableLocation implements EntityLocation {

	public final double x, y, z;

	public ImmutableEntityLocation(World world, double x, double y, double z) {
		super(world);
		this.x = x;
		this.y = y;
		this.z = z;
	}

	@Override
	public double getEntityX() {
		return x;
	}

	@Override
	public double getEntityY() {
		return y;
	}

	@Override
	public double getEntityZ() {
		return z;
	}

	@Override
	public MutableEntityLocation asMutable() {
		return new MutableEntityLocation(world, x, y, z);
	}

}