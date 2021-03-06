// Copyright (c) 2018. Distributed under the MIT License (see included LICENSE file).
package glib

import scala.scalanative.interop.AutoReleasable
import scalanative.cobj._

/**
 * This trait is not defined by GLib, but reflects the fact that
 * all GLib objects allocated with `_new()` have some sort of `_free()`.
 * All object-oriented bindings should implement this trait.
 */
trait GAllocated extends CObject with AutoReleasable
