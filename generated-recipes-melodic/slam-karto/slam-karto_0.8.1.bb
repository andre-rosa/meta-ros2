# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "This package pulls in the Karto mapping library, and provides a ROS      wrapper for using it."
AUTHOR = "Michael Ferguson <mfergs7@gmail.com>"
ROS_AUTHOR = "Brian Gerkey"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=46ee8693f40a89a31023e97ae17ecf19"

ROS_CN = "slam_karto"
ROS_BPN = "slam_karto"

ROS_BUILD_DEPENDS = " \
    cmake-modules \
    libeigen \
    message-filters \
    nav-msgs \
    open-karto \
    rosconsole \
    roscpp \
    sensor-msgs \
    sparse-bundle-adjustment \
    tf \
    visualization-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    libeigen \
    message-filters \
    nav-msgs \
    open-karto \
    rosconsole \
    roscpp \
    sensor-msgs \
    sparse-bundle-adjustment \
    tf \
    visualization-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    libeigen \
    message-filters \
    nav-msgs \
    open-karto \
    rosconsole \
    roscpp \
    sensor-msgs \
    sparse-bundle-adjustment \
    tf \
    visualization-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-gbp/slam_karto-release/archive/release/melodic/slam_karto/0.8.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "92146d6603533718383657285f5857a5"
SRC_URI[sha256sum] = "5a602df47e9778bf47a4e51c2e263c27188f949686e525bb8a446c2eb6637eea"
S = "${WORKDIR}/slam_karto-release-release-melodic-slam_karto-0.8.1-0"

ROS_BUILD_TYPE = "catkin"
ROS_COMPONENT_TYPE = "${@ros_common__get_component_type('slam-karto', d)}"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('slam-karto', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/slam-karto/slam-karto_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/slam-karto/slam-karto-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/slam-karto/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/slam-karto/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
