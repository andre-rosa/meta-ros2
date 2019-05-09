# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "This library provides functionality to simplify working with the     navigation messages defined in marti_nav_msgs."
AUTHOR = "Marc Alban <malban@swri.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "marti_common"
ROS_BPN = "swri_route_util"

ROS_BUILD_DEPENDS = " \
    marti-common-msgs \
    marti-nav-msgs \
    roscpp \
    swri-geometry-util \
    swri-math-util \
    swri-transform-util \
    visualization-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    marti-common-msgs \
    marti-nav-msgs \
    roscpp \
    swri-geometry-util \
    swri-math-util \
    swri-transform-util \
    visualization-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    marti-common-msgs \
    marti-nav-msgs \
    roscpp \
    swri-geometry-util \
    swri-math-util \
    swri-transform-util \
    visualization-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/swri-robotics-gbp/marti_common-release/archive/release/melodic/swri_route_util/2.8.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "a492e3c0bac242c6930d1f3ce8613111"
SRC_URI[sha256sum] = "abb33dfe7604804a00e7a03fc1b8460067b3302851e54df037dfcbe1ab0fbe04"
S = "${WORKDIR}/marti_common-release-release-melodic-swri_route_util-2.8.0-0"

ROS_BUILD_TYPE = "catkin"
ROS_COMPONENT_TYPE = "${@ros_common__get_component_type('marti-common', d)}"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('marti-common', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/marti-common/marti-common_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/marti-common/marti-common-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/marti-common/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/marti-common/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
