# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Library to compute SIFT features"
AUTHOR = "Kei Okada <k-okada@jsk.t.u-tokyo.ac.jp>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=46ee8693f40a89a31023e97ae17ecf19"

ROS_BUILD_DEPENDS = " \
    boost \
    mk \
    python-numpy \
    rosboost-cfg \
    roslib \
    rospack \
    subversion \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    boost \
    python-numpy \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    boost \
    python-numpy \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/tork-a/jsk_3rdparty-release/archive/release/melodic/libsiftfast/2.1.11-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "c1e880576f4fb4b9e6ca90a1705bb033"
SRC_URI[sha256sum] = "ca3a75a0f18b137f41486124251c3fc8319bbe4b7b6b959662f46067dffe6457"
S = "${WORKDIR}/jsk_3rdparty-release-release-melodic-libsiftfast-2.1.11-0"

ROS_BUILD_TYPE = "catkin"
ROS_RECIPES_TREE = "recipes-ros2"
ROS_DEPENDENCY_GROUPS = ""

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/jsk-3rdparty/jsk-3rdparty_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/jsk-3rdparty/jsk-3rdparty_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/jsk-3rdparty/jsk-3rdparty-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/jsk-3rdparty/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/jsk-3rdparty/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
inherit ${@ros_superflore_generated__prefix_all('ROS_DEPENDENCY_GROUPS', 'ros_depgrp_', d)}
