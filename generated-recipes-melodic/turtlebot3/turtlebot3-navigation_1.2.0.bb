# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "The turtlebot3_navigation provides roslaunch scripts for starting the navigation."
AUTHOR = "Pyo <pyo@robotis.com>"
ROS_AUTHOR = "Pyo <pyo@robotis.com>"
HOMEPAGE = "http://wiki.ros.org/turtlebot3_navigation"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

ROS_CN = "turtlebot3"
ROS_BPN = "turtlebot3_navigation"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    amcl \
    map-server \
    move-base \
    turtlebot3-bringup \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ROBOTIS-GIT-release/turtlebot3-release/archive/release/melodic/turtlebot3_navigation/1.2.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "ba9bdd93b338373db447f649c631db17"
SRC_URI[sha256sum] = "9599bcd399b7a62899e234f85e9ab1394646211531486ae7510d040b3fd6c890"
S = "${WORKDIR}/turtlebot3-release-release-melodic-turtlebot3_navigation-1.2.0-0"

ROS_BUILD_TYPE = "catkin"
ROS_COMPONENT_TYPE = "${@ros_common__get_component_type('turtlebot3', d)}"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('turtlebot3', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/turtlebot3/turtlebot3_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/turtlebot3/turtlebot3-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/turtlebot3/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/turtlebot3/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
