# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "roscpp_traits contains the message traits code as described in     <a href="http://www.ros.org/wiki/roscpp/Overview/MessagesTraits">MessagesTraits</a>.      This package is a component of <a href="http://www.ros.org/wiki/roscpp">roscpp</a>."
AUTHOR = "Dirk Thomas <dthomas@osrfoundation.org>"
HOMEPAGE = "http://ros.org/wiki/roscpp_traits"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BPN = "roscpp_traits"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    cpp-common \
    rostime \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    cpp-common \
    rostime \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-gbp/roscpp_core-release/archive/release/melodic/roscpp_traits/0.6.12-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "6f5444b38c023cc813e7b62fb77a35f3"
SRC_URI[sha256sum] = "052831da29842d93c6ab003a11eb6f1ba89849302bac6dd4c232471c1db5fd07"
S = "${WORKDIR}/roscpp_core-release-release-melodic-roscpp_traits-0.6.12-0"

ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('roscpp-core', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/roscpp-core/roscpp-core_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/roscpp-core/roscpp-core-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/roscpp-core/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/roscpp-core/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
