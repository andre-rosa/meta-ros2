
def ament__get_python_soabi(d):
  machine_pysoabi_map = {
    'qemux86': 'cpython-35m-' + (d.getVar('QB_SYSTEM_NAME_x86', True) or '').rsplit('-')[-1] + '-${TARGET_OS}-gnu',
    'qemux86-64': 'cpython-35m-' + (d.getVar('QB_SYSTEM_NAME_x86-64', True) or '').rsplit('-')[-1] + '-${TARGET_OS}-gnu',
    'qemuarm64': 'cpython-35m-${TUNE_ARCH}-${TARGET_OS}${ARMPKGSFX_EABI}-gnu',
    'raspberrypi3': 'cpython-35m-${TUNE_ARCH}-${TARGET_OS}${ARMPKGSFX_EABI}',
  }
  try:
    return machine_pysoabi_map[d.getVar('MACHINE', True)]
  except KeyError:
    bb.fatal('Unknown MACHINE name; can not infer the PYTHON_SOABI template.')

EXTRA_OECMAKE_append = " -DBUILD_TESTING=OFF -DPYTHON_SOABI=${@ament__get_python_soabi(d)}"
# XXX Without STAGING_DIR_HOST path included, rmw-implementation:do_configure() fails with:
#
#    "Could not find ROS middleware implementation 'NOTFOUND'"
#
export AMENT_PREFIX_PATH="${STAGING_DIR_HOST}${prefix};${STAGING_DIR_NATIVE}${prefix}"

inherit cmake python3native

do_install_append() {
    rm -rf ${D}${datadir}/${ROS_BPN}/environment
    rm -f ${D}${datadir}/${ROS_BPN}/local_setup.bash
    rm -f ${D}${datadir}/${ROS_BPN}/local_setup.sh
    rm -f ${D}${datadir}/${ROS_BPN}/local_setup.zsh
    rm -f ${D}${prefix}/local_setup.bash
    rm -f ${D}${prefix}/local_setup.sh
    rm -f ${D}${prefix}/local_setup.zsh
    rm -f ${D}${prefix}/setup.bash
    rm -f ${D}${prefix}/setup.sh
    rm -f ${D}${prefix}/setup.zsh
    rm -f ${D}${prefix}/_order_packages.py
}

FILES_${PN} = " \
    ${datadir}/${ROS_BPN}/package.xml \
    ${datadir}/${ROS_BPN}/resource \
    ${datadir}/${ROS_BPN}/msg \
    ${datadir}/${ROS_BPN}/srv \
    ${datadir}/ament_index \
    ${libdir}/${PYTHON_DIR} \
    ${libdir}/${ROS_BPN} \
    ${libdir}/lib*.so \
"

FILES_${PN}-dev = " \
    ${datadir}/${ROS_BPN}/cmake \
    ${includedir} \
"
