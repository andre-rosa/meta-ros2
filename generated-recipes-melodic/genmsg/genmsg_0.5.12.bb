# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Standalone Python library for generating ROS message and service data structures for various languages."
AUTHOR = "Dirk Thomas <dthomas@osrfoundation.org>"
HOMEPAGE = "http://www.ros.org/wiki/genmsg"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    catkin \
    python-empy \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    catkin \
    python-empy \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-gbp/genmsg-release/archive/release/melodic/genmsg/0.5.12-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "8c555c4c9feca08c3e0f2b53d1db1b90"
SRC_URI[sha256sum] = "6398881d14a9653d5fccff7733c2162513814bb14350bd7958c5cc2c36201e9e"
S = "${WORKDIR}/genmsg-release-release-melodic-genmsg-0.5.12-0"

ROS_BUILD_TYPE = "catkin"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/genmsg/genmsg_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/genmsg/genmsg_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/genmsg/genmsg-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/genmsg/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/genmsg/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
