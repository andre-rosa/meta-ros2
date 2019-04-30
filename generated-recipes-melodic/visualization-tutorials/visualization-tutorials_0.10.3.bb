# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Metapackage referencing tutorials related to rviz and visualization."
AUTHOR = "William Woodall <william@osrfoundation.org>"
HOMEPAGE = "http://ros.org/wiki/visualization_tutorials"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=01c2bc31767ccb3a68e12f02612b2a97"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    interactive-marker-tutorials \
    librviz-tutorial \
    rviz-plugin-tutorials \
    rviz-python-tutorial \
    visualization-marker-tutorials \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    interactive-marker-tutorials \
    librviz-tutorial \
    rviz-plugin-tutorials \
    rviz-python-tutorial \
    visualization-marker-tutorials \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-gbp/visualization_tutorials-release/archive/release/melodic/visualization_tutorials/0.10.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "eaee57f12237e51248b4c71bbf34244f"
SRC_URI[sha256sum] = "5f67b564a5f87b4d7113b97de74e987a956d3985dac7639204b4ba697a056007"
S = "${WORKDIR}/visualization_tutorials-release-release-melodic-visualization_tutorials-0.10.3-0"

ROS_BUILD_TYPE = "catkin"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/visualization-tutorials/visualization-tutorials_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/visualization-tutorials/visualization-tutorials_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/visualization-tutorials/visualization-tutorials-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/visualization-tutorials/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/visualization-tutorials/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
