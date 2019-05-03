# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "Package which implements capabilities, including code to parse capability interface specs, to parse capability provider specs, and implement the capability server."
AUTHOR = "William Woodall <william@osrfoundation.org>"
HOMEPAGE = "http://wiki.ros.org/capabilities"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BPN = "capabilities"

ROS_BUILD_DEPENDS = " \
    message-generation \
    roslaunch \
    rospy \
    rostest \
    std-msgs \
    std-srvs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    bondpy \
    message-runtime \
    nodelet \
    python-yamllint-native \
    roslaunch \
    rospy \
    std-msgs \
    std-srvs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    bondpy \
    message-runtime \
    nodelet \
    python-yamllint-native \
    roslaunch \
    rospy \
    std-msgs \
    std-srvs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    geometry-msgs \
    python-coverage \
    python-mock \
    python-pep8 \
    rosservice \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-gbp/capabilities-release/archive/release/melodic/capabilities/0.2.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "d9dc76bfdb7994d8aa2351f3edb8f6d3"
SRC_URI[sha256sum] = "adfb1e8a3002fcfc90f654c8def944f6cd7a8753b3e908b5760eca786b1546ef"
S = "${WORKDIR}/capabilities-release-release-melodic-capabilities-0.2.0-0"

ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('capabilities', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/capabilities/capabilities_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/capabilities/capabilities-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/capabilities/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/capabilities/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
