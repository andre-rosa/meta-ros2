# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "3-D/6-DOF localization for mobile robots with 3-D LIDAR(s)"
AUTHOR = "Atsushi Watanabe <atsushi.w@ieee.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BUILD_DEPENDS = " \
    geometry-msgs \
    libeigen \
    mcl-3dl-msgs \
    nav-msgs \
    pcl-ros \
    roscpp \
    sensor-msgs \
    std-msgs \
    std-srvs \
    tf2 \
    tf2-geometry-msgs \
    tf2-ros \
    tf2-sensor-msgs \
    visualization-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    geometry-msgs \
    libeigen \
    mcl-3dl-msgs \
    nav-msgs \
    pcl-ros \
    roscpp \
    sensor-msgs \
    std-msgs \
    std-srvs \
    tf2 \
    tf2-geometry-msgs \
    tf2-ros \
    tf2-sensor-msgs \
    visualization-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    geometry-msgs \
    libeigen \
    mcl-3dl-msgs \
    nav-msgs \
    pcl-ros \
    roscpp \
    sensor-msgs \
    std-msgs \
    std-srvs \
    tf2 \
    tf2-geometry-msgs \
    tf2-ros \
    tf2-sensor-msgs \
    visualization-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    roslint \
    rostest \
    rosunit \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/at-wat/mcl_3dl-release/archive/release/melodic/mcl_3dl/0.1.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "f10f058df13ec5d91b03fe4e3902d981"
SRC_URI[sha256sum] = "28b8194bd2312f9add9f1d4350364f6adcaab721056dbaa6924d99e727137371"
S = "${WORKDIR}/mcl_3dl-release-release-melodic-mcl_3dl-0.1.4-0"

ROS_BUILD_TYPE = "catkin"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/mcl-3dl/mcl-3dl_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/mcl-3dl/mcl-3dl_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/mcl-3dl/mcl-3dl-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/mcl-3dl/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/mcl-3dl/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
