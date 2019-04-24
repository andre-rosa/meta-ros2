# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A set of tools and interfaces extending the capabilities of c++ to      provide a lightweight, consistent interface with a focus for control     programming."
AUTHOR = "Daniel Stonier <d.stonier@gmail.com>"
HOMEPAGE = "http://www.ros.org/wiki/ecl_core"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ecl-command-line \
    ecl-concepts \
    ecl-containers \
    ecl-converters \
    ecl-core-apps \
    ecl-devices \
    ecl-eigen \
    ecl-exceptions \
    ecl-formatters \
    ecl-geometry \
    ecl-ipc \
    ecl-linear-algebra \
    ecl-math \
    ecl-mpl \
    ecl-sigslots \
    ecl-statistics \
    ecl-streams \
    ecl-threads \
    ecl-time \
    ecl-type-traits \
    ecl-utilities \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ecl-command-line \
    ecl-concepts \
    ecl-containers \
    ecl-converters \
    ecl-core-apps \
    ecl-devices \
    ecl-eigen \
    ecl-exceptions \
    ecl-formatters \
    ecl-geometry \
    ecl-ipc \
    ecl-linear-algebra \
    ecl-math \
    ecl-mpl \
    ecl-sigslots \
    ecl-statistics \
    ecl-streams \
    ecl-threads \
    ecl-time \
    ecl-type-traits \
    ecl-utilities \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/yujinrobot-release/ecl_core-release/archive/release/melodic/ecl_core/0.62.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "ef8a38da813678b53a863b063efa24d8"
SRC_URI[sha256sum] = "faf777d4df832763a55bb0e32b19e5bc391f094d21aaec4acce62c11ed1695d5"
S = "${WORKDIR}/ecl_core-release-release-melodic-ecl_core-0.62.2-0"

ROS_BUILD_TYPE = "catkin"
ROS_RECIPES_TREE = "recipes-ros2"
ROS_DEPENDENCY_GROUPS = ""

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/ecl-core/ecl-core_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/ecl-core/ecl-core_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/ecl-core/ecl-core-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/ecl-core/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/ecl-core/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
inherit ${@ros_superflore_generated__prefix_all('ROS_DEPENDENCY_GROUPS', 'ros_depgrp_', d)}
