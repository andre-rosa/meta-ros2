# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "Message definitions for trajectory_tracker package"
AUTHOR = "Atsushi Watanabe <atsushi.w@ieee.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BPN = "trajectory_tracker_msgs"

ROS_BUILD_DEPENDS = " \
    geometry-msgs \
    message-generation \
    std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    geometry-msgs \
    message-runtime \
    std-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    geometry-msgs \
    message-runtime \
    std-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    nav-msgs \
    roscpp \
    roslint \
    rosunit \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/at-wat/neonavigation_msgs-release/archive/release/melodic/trajectory_tracker_msgs/0.3.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "b5e4211d25bb366290ad8fe6fcc0d7b6"
SRC_URI[sha256sum] = "c6c75c98fa9489ae279b8e4f5b88e7f34a23c3ca66b9543851858a140f56778e"
S = "${WORKDIR}/neonavigation_msgs-release-release-melodic-trajectory_tracker_msgs-0.3.1-0"

ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('neonavigation-msgs', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/neonavigation-msgs/neonavigation-msgs_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/neonavigation-msgs/neonavigation-msgs-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/neonavigation-msgs/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/neonavigation-msgs/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
