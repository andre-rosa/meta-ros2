# FIXME: My intuition says that it should be enough to depend on ament-cmake-native only
#        since ament-cmake has runtime dependencies on all other needed ament-cmake-* packages.
#        Yet in practice all ament-based packages have to depend explicitly on the native
#        ament-cmake-* packages.
DEPENDS_append = " \
    ament-cmake-native \
    ament-cmake-export-definitions-native \
    ament-cmake-export-dependencies-native \
    ament-cmake-export-include-directories-native \
    ament-cmake-export-interfaces-native \
    ament-cmake-export-libraries-native \
    ament-cmake-export-link-flags-native \
    ament-cmake-libraries-native \
    ament-cmake-python-native \
    ament-cmake-target-dependencies-native \
    ament-cmake-include-directories-native \
    ament-cmake-test-native \
"

DEPENDS_append_bouncy = " \
    ament-tools-native \
"

def ament__get_python_soabi(d):
  machine_pysoabi_map = {
    'qemux86': 'cpython-35m-' + (d.getVar('QB_SYSTEM_NAME_x86') or '').rsplit('-')[-1] + '-${TARGET_OS}-gnu',
    'qemux86-64': 'cpython-35m-' + (d.getVar('QB_SYSTEM_NAME_x86-64') or '').rsplit('-')[-1] + '-${TARGET_OS}-gnu',
    'qemuarm64': 'cpython-35m-${TUNE_ARCH}-${TARGET_OS}${ARMPKGSFX_EABI}-gnu',
    'raspberrypi3': 'cpython-35m-${TUNE_ARCH}-${TARGET_OS}${ARMPKGSFX_EABI}',
  }
  try:
    return machine_pysoabi_map[d.getVar('MACHINE')]
  except KeyError:
    bb.fatal('Unknown MACHINE name; can not infer the PYTHON_SOABI template.')

EXTRA_OECMAKE_append = " -DBUILD_TESTING=OFF -DPYTHON_SOABI=${@ament__get_python_soabi(d)}"
# XXX Without STAGING_DIR_HOST path included, rmw-implementation:do_configure() fails with:
#
#    "Could not find ROS middleware implementation 'NOTFOUND'"
#
export AMENT_PREFIX_PATH="${STAGING_DIR_HOST}${prefix};${STAGING_DIR_NATIVE}${prefix}"

inherit cmake python3native
