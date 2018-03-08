package com.ck.unable.to.solve;

public class WaitNotifyLockReleaseTimings {
	//When thread calls wait() on any thread, it immediately releases the lock on that object and enters into waiting state.
	//When thread calls notify() on any thread, it releases lock of that object, but releasing lock may not be immediate.
}
